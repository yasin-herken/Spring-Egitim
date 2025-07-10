package ytespring.egitim.demo.practice2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ytespring.egitim.demo.practice2.Users;


public interface UserRepository extends JpaRepository<Users, Long> {
    Users findByUsername(String username);
}
