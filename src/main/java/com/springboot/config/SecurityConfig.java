//package com.springboot.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//
//@Configuration
//public class SecurityConfig  {
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .antMatchers("/public/**").permitAll() // Public endpoints
//                .antMatchers("/admin/**").hasRole("ADMIN") // Admin-only endpoints
//                .antMatchers("/user/**").hasAnyRole("USER", "ADMIN") // Accessible by USER and ADMIN roles
//                .anyRequest().authenticated() // All other endpoints need authentication
//                .and()
//                .httpBasic(); // Basic Authentication
//
//        return http.build();
//    }
//
//}
