package iTask2;

public class Main {
    public static void main(String[] args) {

      Car car = new Car(100,2020,120,new Coordinates(3,6),2);
      Ship ship = new Ship(20000, 2025, 150, new Coordinates(1,3), 12,"odessa");
      Plane plane = new Plane(500000, 2022, 400, new Coordinates(123,45),
              10000,3);

        System.out.println(car.Move(car.GetCoordinates()));
        Garage garage = new Garage(3);
        garage.vehicles[0] = car;
        garage.vehicles[1] = ship;
        garage.vehicles[2] = plane;
        System.out.println(garage);
    }
}
