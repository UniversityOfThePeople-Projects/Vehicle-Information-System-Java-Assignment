public class Car implements Vehicle, CarVehicle {
    private String make, model, fuelType;
    private int year, numDoors;

    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public void setMake(String make) { this.make = make; }
    public void setModel(String model) { this.model = model; }
    public void setYear(int year) { this.year = year; }
    public int getNumDoors() { return numDoors; }
    public String getFuelType() { return fuelType; }
    public void setNumDoors(int doors) { this.numDoors = doors; }
    public void setFuelType(String fuelType) { this.fuelType = fuelType; }

    @Override
    public String toString() {
        return "[Car] " + make + " " + model + ", " + year + ", " + numDoors + " doors, Fuel: " + fuelType;
    }
}