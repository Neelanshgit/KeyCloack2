package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	final String[] allowedUrl = { "/auth/**", "/swagger-ui/**", "/v3/api-docs/**" };

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.cors().and().csrf().disable().authorizeRequests().requestMatchers(allowedUrl).permitAll().anyRequest()
				.authenticated();

		http.oauth2ResourceServer(t -> {
			t.jwt(Customizer.withDefaults());

		});
		http.sessionManagement(t -> {
			t.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		});

		return http.build();
	}

}
