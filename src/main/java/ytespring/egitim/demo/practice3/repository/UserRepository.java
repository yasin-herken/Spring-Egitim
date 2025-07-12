package ytespring.egitim.demo.practice3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ytespring.egitim.demo.practice3.Users;

import java.util.Optional;


public interface UserRepository extends JpaRepository<Users, Long> {
    Optional<Users> findByUsername(String username);
}
