package ru.zarya.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.zarya.spring.model.User;

public interface UserRepository extends JpaRepository<User,Integer> {

}