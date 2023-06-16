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
@Table(name = "equipment", schema = "warehouse")
public class Equipment extends BaseEntity {
    @NotNull
    @ManyToOne
    private Stack stack;
    @NotEmpty
    private String cell;
    @NotNull
    private Date datetime;
}
