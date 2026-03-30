package com.example.CarServicePart_1.web;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

class AttendentControllerTest {

    private final MockMvc mockMvc = MockMvcBuilders.standaloneSetup(new AttendentController())
            .setViewResolvers(viewResolver())
            .build();

    @Test
    void returnsAttendentView() throws Exception {
        mockMvc.perform(get("/attendent/101"))
                .andExpect(status().isOk())
                .andExpect(model().attribute("attendentId", "101"))
                .andExpect(model().attribute("attendentName", "Test 123"))
                .andExpect(model().attribute("speciality", "Engine, Bodyshop"))
                .andExpect(view().name("attendent"));
    }

    private InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
}
