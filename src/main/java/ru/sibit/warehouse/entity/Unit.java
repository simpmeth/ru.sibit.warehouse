package ru.sibit.warehouse.entity;

import lombok.Data;
import ru.sibit.warehouse.entity.base.NamedEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "unit", schema = "warehouse")
public class Unit extends NamedEntity {
}
