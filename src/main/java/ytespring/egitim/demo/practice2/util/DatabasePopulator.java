package ytespring.egitim.demo.practice2.util;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ytespring.egitim.demo.practice2.Authority;
import ytespring.egitim.demo.practice2.Users;
import ytespring.egitim.demo.practice2.repository.AuthorityRepository;
import ytespring.egitim.demo.practice2.repository.UserRepository;

import java.util.List;
import java.util.Set;

@Component
@RequiredArgsConstructor
public class DatabasePopulator {

    private final UserRepository userRepository;
    private final AuthorityRepository authorityRepository;

    @PostConstruct
    @Transactional
    public void populateDatabaseAfterInit() {
        List<Authority> savedAuthorities = authorityRepository.saveAll(Set.of(new Authority(null, "READ"), new Authority(null, "WRITE")));
        Users adminUser = new Users(null, "admin", "admin", Set.copyOf(savedAuthorities));
        Users normalUser = new Users(null, "user", "user", Set.of(savedAuthorities.get(0)));
        Users sysUser = new Users(null, "sys", "sys", Set.of());

        userRepository.saveAll(List.of(adminUser, normalUser, sysUser));
    }
}
