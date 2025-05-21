public class Truck implements Vehicle, TruckVehicle {
    private String make, model, transmissionType;
    private int year, cargoCapacity;

    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public void setMake(String make) { this.make = make; }
    public void setModel(String model) { this.model = model; }
    public void setYear(int year) { this.year = year; }
    public int getCargoCapacity() { return cargoCapacity; }
    public String getTransmissionType() { return transmissionType; }
    public void setCargoCapacity(int capacity) { this.cargoCapacity = capacity; }
    public void setTransmissionType(String transmission) { this.transmissionType = transmission; }

    @Override
    public String toString() {
        return "[Truck] " + make + " " + model + ", " + year + ", Cargo: " + cargoCapacity + "kg, Transmission: " + transmissionType;
    }
}