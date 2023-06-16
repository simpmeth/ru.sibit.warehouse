package ru.sibit.warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sibit.warehouse.entity.Leftover;

public interface LeftoverRepository extends JpaRepository<Leftover, Long> {
}
