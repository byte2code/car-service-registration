package com.example.CarServicePart_1.web;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

class SupportControllerTest {

    private final MockMvc mockMvc = MockMvcBuilders.standaloneSetup(new SupportController())
            .setViewResolvers(viewResolver())
            .build();

    @Test
    void returnsSupportView() throws Exception {
        mockMvc.perform(get("/support").param("id", "101"))
                .andExpect(status().isOk())
                .andExpect(model().attribute("message", "Your car ID 101"))
                .andExpect(view().name("support"));
    }

    private InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
}
