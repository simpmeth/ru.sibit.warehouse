package ru.sibit.warehouse.entity;

import lombok.Data;
import ru.sibit.warehouse.entity.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "unit", schema = "warehouse")
public class Receiving extends BaseEntity {
    private String goods;
}
