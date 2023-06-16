package ru.sibit.warehouse.entity.base;

import lombok.Data;
import ru.sibit.warehouse.entity.Provider;
import ru.sibit.warehouse.entity.User;

import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.sql.Date;

@MappedSuperclass
@Data
public class GoodsMoving extends BaseEntity {
    @NotNull
    @ManyToOne
    private Provider provider;
    @NotNull
    @ManyToOne
    private User manager;
    @NotNull
    private int documentCode;
    @NotNull
    private Date datetime;
    @NotEmpty
    private String goods;
}
