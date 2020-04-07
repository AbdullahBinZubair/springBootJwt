package com.spring.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.security.filters.JwtRequestFilter;

@Configuration
public class SpringConfig {

	@Bean
	public JwtUtil jwtutil() {
		return new JwtUtil();
	}
	
	@Bean
	public JwtRequestFilter jwtRequestFilter() {
		return new JwtRequestFilter();
	}
}
