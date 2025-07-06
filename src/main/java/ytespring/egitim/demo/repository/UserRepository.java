package ytespring.egitim.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ytespring.egitim.demo.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByName(String name);
}
