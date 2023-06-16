package ru.sibit.warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sibit.warehouse.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
