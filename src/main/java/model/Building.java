package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Building {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int buildingId;
    private int numberOfFloors;
    private int numberOfApartments;

    public int getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(int buildingId) {
        this.buildingId = buildingId;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public int getNumberOfApartments() {
        return numberOfApartments;
    }

    public void setNumberOfApartments(int numberOfApartments) {
        this.numberOfApartments = numberOfApartments;
    }
}
