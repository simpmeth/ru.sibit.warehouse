package ru.sibit.warehouse.entity;

import lombok.Data;
import ru.sibit.warehouse.entity.base.NamedEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "warehouse", schema = "warehouse")
public class Warehouse extends NamedEntity {
    @ManyToOne
    private Town town;
}
