package iTask2;

import java.util.Objects;

public class Ship extends Vehicle{
    private int passageres;
    private String port;

    public Ship(double price, int year, int speed, Coordinates coordinates, int passageres, String port) {
        super(price, year, speed, coordinates);
        this.passageres = passageres;
        this.port = port;
    }
    @Override
    public String toString() {
        return "Ship  " +  "price " + (getPrice()<0? "incorrect price":getPrice())+"  , year= "+(getYear()<0? "incorrect year":getYear())+
                " , speed= "+(getSpeed()<0? "incorrect speed": getSpeed())+
                " , passageres = " + (this.passageres<0? "incorrect info about passagers":this.passageres) +
                ", port'" + this.port + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ship)) return false;
        if (!super.equals(o)) return false;
        Ship ship = (Ship) o;
        return getPassageres() == ship.getPassageres() && getPort().equals(ship.getPort());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPassageres(), getPort());
    }

    public int getPassageres() {
        return passageres;
    }

    public void setPassageres(int passageres) {
        if (passageres > 0 && passageres<100){
            this.passageres = passageres;
        }
        else{
            this.passageres = -1;
        }
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port.toUpperCase();
    }

}
