package model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;

    @ManyToOne
    @JoinColumn(name = "supplierId")
    private Supplier supplier;

    private BigDecimal costTotal;
    private Date deliveryDate;
}
