# Vehicle Information System – Java Assignment

## 📘 Overview
This project is a Java-based console application that simulates a simple vehicle rental system. Users can add different types of vehicles (Car, Motorcycle, Truck), view all registered vehicles, and exit while displaying a summary. It demonstrates key object-oriented programming (OOP) concepts and adheres to clean code and modular design practices.

---

## 🚀 Features
- Add vehicles (Car, Motorcycle, Truck)
- Display all registered vehicles at any time
- Exit and view full summary
- In-memory list for storing vehicle data during runtime

---

## 📚 OOP Principles Demonstrated
- **Encapsulation**: All attributes are private with public getters/setters
- **Inheritance**: Vehicle classes implement shared and specific interfaces
- **Polymorphism**: Unified `List<Vehicle>` to store and print all vehicle types
- **Abstraction**: Interfaces define behavior for all vehicle types

---

## 🛠 How to Run

### ✅ Step 1: Compile the Code
```bash
cd src/classes
javac -cp ../interfaces ../interfaces/*.java *.java
```

### ▶️ Step 2: Run the App
```bash
java -cp ../interfaces:. VehicleRentalApp
```

---

## Folder Structure
```
src/
├── interfaces/
│   ├── Vehicle.java
│   ├── CarVehicle.java
│   ├── MotorVehicle.java
│   └── TruckVehicle.java
└── classes/
    ├── Car.java
    ├── Motorcycle.java
    ├── Truck.java
    └── VehicleRentalApp.java
```

---

## ✍️ Sample Output

```
Vehicle Rental System
======================
Choose a vehicle to add:
1. Car  2. Motorcycle  3. Truck  4. Exit  5. Show Inventory
Enter choice:
```

---

## 📄 License
This project is for academic demonstration purposes only.