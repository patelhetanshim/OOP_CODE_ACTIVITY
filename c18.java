import java.util.Scanner;

abstract class Vehicle {
    abstract String fuelType();
    abstract int noOfWheels();
}

class Car extends Vehicle {
    String fuel;

    Car(String fuel) {
        this.fuel = fuel;
    }

    String fuelType() {
        return fuel;
    }

    int noOfWheels() {
        return 4;
    }
}

class Bike extends Vehicle {
    String fuel;

    Bike(String fuel) {
        this.fuel = fuel;
    }

    String fuelType() {
        return fuel;
    }

    int noOfWheels() {
        return 2;
    }
}

public class c18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String carFuel, bikeFuel;

        System.out.print("Enter fuel type for Car (Petrol/Diesel): ");
        carFuel = sc.nextLine();

        System.out.print("Enter fuel type for Bike (Petrol): ");
        bikeFuel = sc.nextLine();

        Vehicle v1 = new Car(carFuel);
        Vehicle v2 = new Bike(bikeFuel);

        System.out.println("\nCar Details:");
        System.out.println("Fuel Type: " + v1.fuelType());
        System.out.println("Wheels: " + v1.noOfWheels());

        System.out.println("\nBike Details:");
        System.out.println("Fuel Type: " + v2.fuelType());
        System.out.println("Wheels: " + v2.noOfWheels());
    }
}