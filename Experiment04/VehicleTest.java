interface Vehicle {

    void start();

    default void stop() {
        System.out.println("Vehicle stopped");
    }

    static void honk() {
        System.out.println("Honking horn");
    }
}

class Car implements Vehicle {

    public void start() {
        System.out.println("Car started");
    }

    public void stop() {
        System.out.println("Car stopped by braking");
    }
}

class Bike implements Vehicle {

    public void start() {
        System.out.println("Bike started");
    }
}

public class VehicleTest {
    public static void main(String[] args) {

        Vehicle.honk();

        Car car = new Car();
        Bike bike = new Bike();

        car.start();
        car.stop();

        bike.start();
        bike.stop();
    }
}