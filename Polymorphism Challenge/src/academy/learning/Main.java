package academy.learning;

class Car {

    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine(){
        return "Started engine";
    }

    public String accelerate(){
       return this.name + " is accelerating";
    }

    public String brake(){
        return this.name + " is  braking";
    }
}

class PorscheBoxster extends Car{
    public PorscheBoxster(){
        super("Porsche Boxster", 6);
    }
}

class F150 extends Car{
    public F150(){
        super("Ford F150", 6);
    }
}

class F12 extends Car{
    public F12(){
        super("Ferrari F12", 12);
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car car = new F12();
        System.out.println(car.getName());
        System.out.println(car.accelerate());
    }
}
