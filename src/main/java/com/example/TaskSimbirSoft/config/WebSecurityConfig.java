//package com.example.TaskSimbirSoft.config;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//import static org.springframework.security.config.Customizer.withDefaults;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig{
//
////    @Autowired
////    DataSource dataSource;
//
//    @Autowired
//    private JpaUserDetailsService myUserDetailsService;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .csrf()
//                .disable()
//                .authorizeHttpRequests()
//                .requestMatchers("/login**")
//                .permitAll()
//                .anyRequest()
//                .authenticated()
//                .and()
//                .userDetailsService(myUserDetailsService)
//                .headers(headers -> headers.frameOptions().sameOrigin())
//                .httpBasic(withDefaults());
//
//
//        return http.build();
//    }
//
//
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth
//                .userDetailsService(myUserDetailsService)
//                .passwordEncoder(passwordEncoder);
//    }
//
////    @Bean
////    public UserDetailsManager users(DataSource dataSource) {
////        UserDetails user = User.withDefaultPasswordEncoder()
////                .username("user")
////                .password("password")
////                .roles("USER")
////                .build();
////        JdbcUserDetailsManager users = new JdbcUserDetailsManager(dataSource);
////        users.createUser(user);
////        return users;
////    }
//
//
//}
