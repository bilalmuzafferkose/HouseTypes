package main.java.com.bilalkose.housetypes.model;
import java.math.BigDecimal;

public class House {
    private BigDecimal price;
    private int numberOfRooms;
    private int numberOfHalls;
    private double squareMeters;

    public House(BigDecimal price, int numberOfRooms, int numberOfHalls, double squareMeters) {
        this.price = price;
        this.numberOfRooms = numberOfRooms;
        this.numberOfHalls = numberOfHalls;
        this.squareMeters = squareMeters;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfHalls() {
        return numberOfHalls;
    }

    public void setNumberOfHalls(int numberOfHalls) {
        this.numberOfHalls = numberOfHalls;
    }

    public double getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(double squareMeters) {
        this.squareMeters = squareMeters;
    }
}