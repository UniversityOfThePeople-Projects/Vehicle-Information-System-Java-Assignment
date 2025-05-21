public class Motorcycle implements Vehicle, MotorVehicle {
    private String make, model, motorcycleType;
    private int year, numWheels;

    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public void setMake(String make) { this.make = make; }
    public void setModel(String model) { this.model = model; }
    public void setYear(int year) { this.year = year; }
    public int getNumWheels() { return numWheels; }
    public String getMotorcycleType() { return motorcycleType; }
    public void setNumWheels(int wheels) { this.numWheels = wheels; }
    public void setMotorcycleType(String type) { this.motorcycleType = type; }

    @Override
    public String toString() {
        return "[Motorcycle] " + make + " " + model + ", " + year + ", " + numWheels + " wheels, Type: " + motorcycleType;
    }
}