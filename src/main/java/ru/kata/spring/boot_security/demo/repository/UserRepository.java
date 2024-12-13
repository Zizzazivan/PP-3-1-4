package ru.kata.spring.boot_security.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.kata.spring.boot_security.demo.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
//    @Query(value = "select u from User u left join fetch u.roles where u.login=:login")
//    User getUserByLogin(@Param("login") String login);

    User findByUsername(String username); 
}
