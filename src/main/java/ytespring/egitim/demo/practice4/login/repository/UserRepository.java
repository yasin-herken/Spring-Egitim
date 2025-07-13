package ytespring.egitim.demo.practice4.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ytespring.egitim.demo.practice4.Users;

import java.util.Optional;


public interface UserRepository extends JpaRepository<Users, Long> {
    Optional<Users> findByUsername(String username);
}
