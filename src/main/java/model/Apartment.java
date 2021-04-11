package model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Apartment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int apartmentId;

    @ManyToOne
    @JoinColumn(name = "buildingId")
    private Building building;

    private int floorNumberId;
    private int numberOfRoomsId;
    private BigDecimal price;


    public int getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(int apartmentId) {
        this.apartmentId = apartmentId;
    }

    public int getFloorNumberId() {
        return floorNumberId;
    }

    public void setFloorNumberId(int floorNumberId) {
        this.floorNumberId = floorNumberId;
    }

    public int getNumberOfRoomsId() {
        return numberOfRoomsId;
    }

    public void setNumberOfRoomsId(int numberOfRoomsId) {
        this.numberOfRoomsId = numberOfRoomsId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
