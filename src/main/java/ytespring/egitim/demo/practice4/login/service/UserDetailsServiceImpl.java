package ytespring.egitim.demo.practice4.login.service;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ytespring.egitim.demo.practice4.Authority;
import ytespring.egitim.demo.practice4.Users;
import ytespring.egitim.demo.practice4.login.repository.UserRepository;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @PostConstruct
    public void init() {
        userRepository.save(new Users(null, "user", passwordEncoder.encode("user"), Set.of(new Authority("USER"))));
        userRepository.save(new Users(null, "admin", passwordEncoder.encode("admin"), Set.of(new Authority("USER"), new Authority("ADMIN"))));
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User with username %s is not present".formatted(username)));
    }
}
