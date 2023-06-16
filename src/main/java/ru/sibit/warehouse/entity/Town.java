package ru.sibit.warehouse.entity;

import lombok.Data;
import ru.sibit.warehouse.entity.base.NamedEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "town", schema = "warehouse")
public class Town extends NamedEntity {
}
