package ru.sibit.warehouse.entity;

import lombok.Data;
import ru.sibit.warehouse.entity.base.NamedEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Data
@Table(name = "provider", schema = "warehouse")
public class Provider extends NamedEntity {
    @NotEmpty
    private int address;
    @NotEmpty
    private int phone;
}
