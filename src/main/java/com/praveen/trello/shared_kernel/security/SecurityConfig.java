// package com.praveen.trello.shared_kernel.security;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import
// org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.web.SecurityFilterChain;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.security.crypto.password.PasswordEncoder;

// @Configuration
// public class SecurityConfig {

// @Bean
// public PasswordEncoder passwordEncoder() {
// return new BCryptPasswordEncoder();
// }

// @Bean
// public SecurityFilterChain securityFilterChain(HttpSecurity http) throws
// Exception {
// http
// .csrf(csrf -> csrf.disable()) // Disable CSRF for simplicity (not recommended
// for production)
// .authorizeRequests(auth -> auth
// .antMatchers("/api/health").permitAll() // Allow public access to health
// check
// .anyRequest().authenticated() // Require authentication for all other
// endpoints
// )
// .formLogin(login -> login.disable()) // Disable default login form
// .httpBasic(basic -> basic.disable()); // Disable HTTP Basic Auth

// return http.build();
// }
// }

// // @Configuration
// // public class SecurityConfig {

// // @Bean
// // public SecurityFilterChain securityFilterChain(HttpSecurity http) throws
// // Exception {
// // http
// // .csrf(csrf -> csrf.disable()) // Disable CSRF for simplicity (not
// recommended
// // for production)
// // .authorizeRequests(requests -> requests
// // .antMatchers("/health", "/").permitAll() // Allow public access to these
// // endpoints
// // .anyRequest().authenticated())
// // .sessionManagement(management ->
// // management.sessionCreationPolicy(SessionCreationPolicy.STATELESS)); // No
// // // session

// // return http.build();
// // }
// // }

package com.praveen.trello.shared_kernel.security;

class SecurityConfig {

}