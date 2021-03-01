package iTask2;

public class Garage {
    public Vehicle[] vehicles;

    public Garage(int vehicleNumber) {
        vehicles = new Vehicle[vehicleNumber];
    }

    @Override
    public String toString() {
        String result = "\nGarage\n\n";
        for (int i = 0; i < this.vehicles.length; i++) {
            result += "\n" + vehicles[i];
        }

        return result;
    }
}
