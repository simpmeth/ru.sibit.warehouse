package ru.sibit.warehouse.entity;

import ru.sibit.warehouse.entity.base.NamedEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "stack_category", schema = "warehouse")
public class StackCategory extends NamedEntity {
}
