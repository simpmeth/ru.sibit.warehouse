package ru.sibit.warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sibit.warehouse.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
