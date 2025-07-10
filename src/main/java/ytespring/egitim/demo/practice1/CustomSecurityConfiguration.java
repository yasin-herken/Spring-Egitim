package ytespring.egitim.demo.practice1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableMethodSecurity
public class CustomSecurityConfiguration {

    public CustomSecurityConfiguration(final AuthenticationManagerBuilder authenticationManagerBuilder, CustomUserDetailsService customUserDetailsService) throws Exception {
        authenticationManagerBuilder.
                userDetailsService(customUserDetailsService)
                .passwordEncoder(NoOpPasswordEncoder.getInstance());
    }

    @Bean
    public SecurityFilterChain customSecurityFilterChain(final HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(authorizeRequests ->
                        authorizeRequests
                                .requestMatchers("/login").permitAll()
                                .requestMatchers("/user").hasAnyAuthority("ADMIN", "USER")
                                .requestMatchers("/admin").hasAuthority("ADMIN")
                                .anyRequest().authenticated()
                )
                .formLogin(Customizer.withDefaults());
        return http.build();
    }
}
