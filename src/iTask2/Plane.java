package iTask2;

import java.util.Objects;

public class Plane extends Vehicle{
    private int hight;
    private int passageres;

    public Plane(double price, int year, int speed, Coordinates coordinates, int hight, int passageres) {
        super(price, year, speed, coordinates);
        this.hight = hight;
        this.passageres = passageres;

    }

    @Override
    public String toString() {
        return "Plane " +  "price " + (getPrice()<0? "incorrect price":getPrice())+" , year= "+(getYear()<0? "incorrect year":getYear())+
                " , speed= "+(getSpeed()<0? "incorrect speed": getSpeed())+
                (getCoordinates())+
                " , hight=" + (getHight()<0? "incorrect hight":getHight()) +
                " , passageres=" + (this.passageres<0? "incorrect info about passagers":this.passageres);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plane)) return false;
        if (!super.equals(o)) return false;
        Plane plane = (Plane) o;
        return getHight() == plane.getHight() && getPassageres() == plane.getPassageres();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getHight(), getPassageres());
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {

        if (hight>5000&& hight<10000){
            this.hight = hight;
        }
        else {
            this.hight = -1;
        }
    }

    public int getPassageres() {
        return passageres;
    }

    public void setPassageres(int passageres) {

        if (passageres > 0 && passageres < 200) {
            this.passageres = passageres;
        } else {
            this.passageres = -1;
        }
    }

}
