import java.util.*;

public class VehicleRentalApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Vehicle> vehicles = new ArrayList<>();

        System.out.println("Vehicle Rental System");
        System.out.println("======================");

        while (true) {
            System.out.println("Choose a vehicle to add:");
            System.out.println("1. Car  2. Motorcycle  3. Truck  4. Exit  5. Show Inventory");
            System.out.print("Enter choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> {
                    Car car = new Car();
                    System.out.print("Enter make: ");
                    car.setMake(scanner.nextLine());
                    System.out.print("Enter model: ");
                    car.setModel(scanner.nextLine());
                    System.out.print("Enter year: ");
                    car.setYear(Integer.parseInt(scanner.nextLine()));
                    System.out.print("Enter number of doors: ");
                    car.setNumDoors(Integer.parseInt(scanner.nextLine()));
                    System.out.print("Enter fuel type: ");
                    car.setFuelType(scanner.nextLine());
                    vehicles.add(car);
                }
                case 2 -> {
                    Motorcycle moto = new Motorcycle();
                    System.out.print("Enter make: ");
                    moto.setMake(scanner.nextLine());
                    System.out.print("Enter model: ");
                    moto.setModel(scanner.nextLine());
                    System.out.print("Enter year: ");
                    moto.setYear(Integer.parseInt(scanner.nextLine()));
                    System.out.print("Enter number of wheels: ");
                    moto.setNumWheels(Integer.parseInt(scanner.nextLine()));
                    System.out.print("Enter motorcycle type (sport, cruiser, off-road): ");
                    moto.setMotorcycleType(scanner.nextLine());
                    vehicles.add(moto);
                }
                case 3 -> {
                    Truck truck = new Truck();
                    System.out.print("Enter make: ");
                    truck.setMake(scanner.nextLine());
                    System.out.print("Enter model: ");
                    truck.setModel(scanner.nextLine());
                    System.out.print("Enter year: ");
                    truck.setYear(Integer.parseInt(scanner.nextLine()));
                    System.out.print("Enter cargo capacity (in kg): ");
                    truck.setCargoCapacity(Integer.parseInt(scanner.nextLine()));
                    System.out.print("Enter transmission type (manual/automatic): ");
                    truck.setTransmissionType(scanner.nextLine());
                    vehicles.add(truck);
                }
                case 4 -> {
                    System.out.println("\nFinal List of Registered Vehicles:");
                    for (Vehicle v : vehicles) {
                        System.out.println(v.toString());
                    }
                    return;
                }
                case 5 -> {
                    if (vehicles.isEmpty()) {
                        System.out.println("No vehicles registered yet.");
                    } else {
                        System.out.println("\nRegistered Vehicles:");
                        for (Vehicle v : vehicles) {
                            System.out.println(v.toString());
                        }
                    }
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
