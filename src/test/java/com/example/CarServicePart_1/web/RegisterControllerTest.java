package com.example.CarServicePart_1.web;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import com.example.CarServicePart_1.domain.Car;
import com.example.CarServicePart_1.domain.Vehicle;
import com.example.CarServicePart_1.service.Registration;
import org.junit.jupiter.api.Test;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

class RegisterControllerTest {

    private final Registration registration = new RegistrationStub();
    private final MockMvc mockMvc = MockMvcBuilders.standaloneSetup(new RegisterController(registration))
            .setViewResolvers(viewResolver())
            .build();

    @Test
    void returnsRegistrationView() throws Exception {
        mockMvc.perform(get("/register"))
                .andExpect(status().isOk())
                .andExpect(model().attributeExists("vehicle"))
                .andExpect(view().name("carregister"));
    }

    @Test
    void redirectsToSuccessPageAfterRegistration() throws Exception {
        mockMvc.perform(post("/done")
                        .param("registerationNumber", "DL01AB1234")
                        .param("carName", "Swift")
                        .param("carDetails", "YES")
                        .param("carWork", "Oil Change"))
                .andExpect(status().is3xxRedirection())
                .andExpect(redirectedUrl("/success?id=101"));
    }

    @Test
    void returnsSuccessView() throws Exception {
        mockMvc.perform(get("/success").param("id", "101"))
                .andExpect(status().isOk())
                .andExpect(model().attribute("carId", 101))
                .andExpect(view().name("success"));
    }

    private InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

    private static class RegistrationStub implements Registration {
        @Override
        public int registerCar(String vehicleNo, String vehicleName, String carDetails, String carWork) {
            return 101;
        }

        @Override
        public Vehicle getNewCar() {
            return new Car(new com.example.CarServicePart_1.repository.CarDAO());
        }
    }
}
