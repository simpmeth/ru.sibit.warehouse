package ru.sibit.warehouse.entity;

import lombok.Data;
import ru.sibit.warehouse.entity.base.NamedEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Table(name = "goods", schema = "warehouse")
public class Goods extends NamedEntity {
    @NotNull
    @ManyToOne
    private Unit unit;
}
