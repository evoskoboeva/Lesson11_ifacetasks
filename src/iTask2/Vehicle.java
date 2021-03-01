package iTask2;

import java.util.Calendar;
import java.util.Objects;

public class Vehicle implements iVehicle {

    private double price;
    private int year;
    private int speed;
    private Coordinates coordinates;

    public Vehicle(double price, int year, int speed, Coordinates coordinates) {
        this.price = price;
        this.year = year;
        this.speed = speed;
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "price=" + price +
                "coordinates"+coordinates+
                ", year=" + year +
                ", speed=" + speed +
                ", coordinates=" + coordinates +
                '}';
    }

    @Override
    public String Move(Coordinates coordinates) {
        return "all vihicles moove"+coordinates;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public Coordinates GetCoordinates() {
        return this.coordinates;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            this.price = -1;
        } else {
            this.price = price;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > Calendar.getInstance().get(Calendar.YEAR)||year<1900) {
            this.year = -1;
        } else {
            this.year = year;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed<0){
            this.speed = -1;
        }
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        Vehicle vehicle = (Vehicle) o;
        return Double.compare(vehicle.getPrice(), getPrice()) == 0 && getYear() == vehicle.getYear() && getSpeed() == vehicle.getSpeed();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPrice(), getYear(), getSpeed());
    }

}
