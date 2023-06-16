package ru.sibit.warehouse.entity;

import ru.sibit.warehouse.entity.base.NamedEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "stack", schema = "warehouse")
public class Stack extends NamedEntity {
    @NotNull
    private int capacity;
    @NotNull
    @ManyToOne
    private StackCategory stackCategory;
    @NotNull
    private int cell;
    @ManyToOne
    private Warehouse warehouse;
}
