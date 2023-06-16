package ru.sibit.warehouse.entity.base;

import lombok.Data;

import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotBlank;

@MappedSuperclass
@Data
public class NamedEntity extends BaseEntity {
    @NotBlank(message = "Обязательно для заполнения")
    private String name;
}
