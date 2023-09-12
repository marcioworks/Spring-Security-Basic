package com.marcio.springsecuritybasicsec3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests(request -> request
                .requestMatchers("/myAccounts","/myBalances","/myCards","/myLoans").authenticated()
                .requestMatchers("/notices","/contact").permitAll());
        http.formLogin(Customizer.withDefaults());
        http.httpBasic(Customizer.withDefaults());
        return http.build();


    }

    /**
     * Configuration to deny all requests;
     */
//        http.authorizeHttpRequests(request -> request.anyRequest().denyAll());

    /**
     * Configuration to permit all requests;
     */
//        http.authorizeHttpRequests(request -> request.anyRequest().permitAll());
}
