package ru.sibit.warehouse.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.sibit.warehouse.entity.Receiving;

public interface ReceivingRepository extends PagingAndSortingRepository<Receiving, Long> {
}
