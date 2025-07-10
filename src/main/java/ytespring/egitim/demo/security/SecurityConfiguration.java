package ytespring.egitim.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {

    //@Autowired
    //public SecurityConfiguration(final AuthenticationManagerBuilder authenticationManagerBuilder) {
    //    try {
    //        var passwordEncoder = NoOpPasswordEncoder.getInstance();
//
    //        authenticationManagerBuilder.inMemoryAuthentication()
    //                .passwordEncoder(passwordEncoder)
    //                .withUser(User.builder().username("user").password(passwordEncoder.encode("user")).authorities("ROLE_USER").build())
    //                .withUser(User.builder().username("admin").password(passwordEncoder.encode("admin")).authorities("ROLE_ADMIN").build());
//
    //    } catch (Exception e) {
    //        throw new RuntimeException("Failed to configure in-memory authentication", e);
    //    }
    //}
//
    //@Bean
    //public SecurityFilterChain securityFilterChain(final HttpSecurity http) throws Exception {
    //    http.authorizeHttpRequests(authorizeRequests ->
    //                    authorizeRequests
    //                            .requestMatchers("/login").permitAll()
    //                            .anyRequest().authenticated()
    //            )
    //            .formLogin(Customizer.withDefaults());
    //    return http.build();
    //}
}
