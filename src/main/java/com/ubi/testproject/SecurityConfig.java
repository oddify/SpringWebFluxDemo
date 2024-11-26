//package com.ubi.testproject;
//
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//import static org.springframework.security.config.Customizer.withDefaults;
//
//@EnableWebSecurity
//@Configuration(proxyBeanMethods = false)
//public class SecurityConfig {
//
//    @Bean
//    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeHttpRequests(authorize ->
//                        authorize.requestMatchers(
//                                "/swagger-ui.html", "/swagger-ui/**",
//                                "/v3/api-docs/**" //<<---(1)
//                        ).permitAll())
//                .authorizeHttpRequests(authorize ->
//                        authorize.anyRequest().authenticated()
//
//                )
//                .formLogin(withDefaults());
//        return http.build();
//    }
//}