package com.example.demo;


import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.contains;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.demo.controller.CoolCarController;

import org.mockito.*;

@SpringBootTest
@AutoConfigureMockMvc
@ExtendWith(MockitoExtension.class)
class CoolCarControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@InjectMocks
	CoolCarController underTest;

	@Test
	void testGetCoolCar() throws Exception {
		// given
		// when
		String actual=underTest.getCoolCar();
		// then
		assertThat(actual).isEqualTo("Cool Car List");
	}
	
	@Test
	void testGetCoolCarEndPoint() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/coolCar"))
		.andExpect(status().isOk())
		.andExpect(content().string("Cool Car List"));
		
	}

}