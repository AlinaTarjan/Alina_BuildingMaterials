package model;

import javax.persistence.*;

@Entity
@Table(name = "apartment_order")
public class ApartmentOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int apartmentOrderId;

    @ManyToOne
    @JoinColumn(name = "apartmentId")
    private Apartment apartment;

    @ManyToOne
    @JoinColumn(name = "orderId")
    private Order order;
}
