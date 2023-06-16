package ru.sibit.warehouse.entity;

import lombok.Data;
import ru.sibit.warehouse.entity.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.sql.Date;

@Entity
@Data
@Table(name = "inventory", schema = "warehouse")
public class Inventory extends BaseEntity {
    @NotNull
    private Date datetime;
    @NotEmpty
    private String description;
    @NotNull
    @ManyToOne
    private User user;
}
