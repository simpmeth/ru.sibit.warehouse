package ru.sibit.warehouse.entity;

import lombok.Data;
import ru.sibit.warehouse.entity.base.GoodsMoving;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "receiving_goods", schema = "warehouse")
public class ReceivingGoods extends GoodsMoving {
}
