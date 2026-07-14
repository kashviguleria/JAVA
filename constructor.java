class Car {

    String name;
    String color;
    int size;

    // Constructor
    Car(String name, String color, int size) {
        this.name = name;
        this.color = color;
        this.size = size;
        // System.out.println("Constructor called");
    }

    void start() {
        System.out.println("Car is starting");
    }

    void stop() {
        System.out.println("Car is stopped");
    }

    void horn() {
        System.out.println("Blow horn");
    }
}

public class constructor {

    public static void main(String[] args) {

        // Creating objects
        Car c1 = new Car("BMW", "Black", 100);
        Car c2 = new Car("Nano", "Yellow", 40);

        // Printing object data
        System.out.println(c1.name);
        System.out.println(c1.color);
        System.out.println(c1.size);

        System.out.println();

        System.out.println(c2.name);
        System.out.println(c2.color);
        System.out.println(c2.size);

        // Calling methods
        c1.start();
        c2.stop();
        c1.horn();
    }
}