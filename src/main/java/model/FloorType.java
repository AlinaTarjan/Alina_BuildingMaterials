package model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "floor_types")
public class FloorType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int floorTypeId;
    private String floorMaterial;
    private String floorColor;
    private BigDecimal pricePerM2;

    public int getFloorTypeId() {
        return floorTypeId;
    }

    public void setFloorTypeId(int floorTypeId) {
        this.floorTypeId = floorTypeId;
    }

    public String getFloorMaterial() {
        return floorMaterial;
    }

    public void setFloorMaterial(String floorMaterial) {
        this.floorMaterial = floorMaterial;
    }

    public String getFloorColor() {
        return floorColor;
    }

    public void setFloorColor(String floorColor) {
        this.floorColor = floorColor;
    }

    public BigDecimal getPricePerM2() {
        return pricePerM2;
    }

    public void setPricePerM2(BigDecimal pricePerM2) {
        this.pricePerM2 = pricePerM2;
    }
}
