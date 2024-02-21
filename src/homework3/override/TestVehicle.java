package homework3.override;

public class TestVehicle {
    /*
    Write a Java program to create a class
    Vehicle with a method called speedUp().
    Create two subclasses Car and Bicycle.
    Override the speedUp() method in each
    subclass to increase the vehicle's speed differently.

    Output:
    Car initial speed: 0
    Motorcycle initial speed: 0

    Car speed increased by 22 units.
    Motorcycle speed increased by 12 units

    Car speed after speeding up: 10
    Motorcycle speed after speeding up: 10
     */
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        System.out.println("Car initial speed: " + car.getSpeed());
        System.out.println("Motorcycle initial speed: " + motorcycle.getSpeed());
        car.speedUp();
        motorcycle.speedUp();
        System.out.println("\nCar speed after speeding up: " + car.getSpeed());
        System.out.println("Motorcycle speed after speeding up: " + motorcycle.getSpeed());
    }
}
