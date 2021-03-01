package iTask2;

import java.util.Objects;

public class Car extends Vehicle {

    private int carryCapacuty;

    public Car(double price, int year, int speed, Coordinates coordinates, int carryCapacuty) {
        super(price, year, speed, coordinates);
        this.carryCapacuty = carryCapacuty;
    }


    @Override
    public String toString() {
        return "Car  " + " price " + (getPrice() < 0 ? "incorrect price" : getPrice()) +
                " , year= " + (getYear() < 0 ? "incorrect year" : getYear()) +
                " , speed= " + (getSpeed() < 0 ? "incorrect speed" : getSpeed()) + "\t coords:"+
                getCoordinates() + " , carryCapacuty= " + (carryCapacuty < 0 ? "incorrect capacity" : carryCapacuty);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return getCarryCapacuty() == car.getCarryCapacuty();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCarryCapacuty());
    }

    public int getCarryCapacuty() {
        return carryCapacuty;
    }

    public void setCarryCapacuty(int carryCapacuty) {
        if (carryCapacuty > 1000 || carryCapacuty < 0) {
            this.carryCapacuty = -1;
        }
        this.carryCapacuty = carryCapacuty;
    }

}
