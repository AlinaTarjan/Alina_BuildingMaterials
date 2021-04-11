package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class WallType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int wallTypeId;
    private String wallMaterial;
    private String wallColor;
    private BigDecimal pricePerM2;

    public int getWallTypeId() {
        return wallTypeId;
    }

    public void setWallTypeId(int wallTypeId) {
        this.wallTypeId = wallTypeId;
    }

    public String getWallMaterial() {
        return wallMaterial;
    }

    public void setWallMaterial(String wallMaterial) {
        this.wallMaterial = wallMaterial;
    }

    public String getWallColor() {
        return wallColor;
    }

    public void setWallColor(String wallColor) {
        this.wallColor = wallColor;
    }

    public BigDecimal getPricePerM2() {
        return pricePerM2;
    }

    public void setPricePerM2(BigDecimal pricePerM2) {
        this.pricePerM2 = pricePerM2;
    }
}
