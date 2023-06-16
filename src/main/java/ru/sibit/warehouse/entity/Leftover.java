package ru.sibit.warehouse.entity;

import lombok.Data;
import ru.sibit.warehouse.entity.base.NamedEntity;

import javax.persistence.Entity;
import javax.persistence.Transient;

@Data
@Entity
@Deprecated
public class Leftover extends NamedEntity {
}
