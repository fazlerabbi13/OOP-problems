
interface Vehical{
    public void start();
}

class Car implements Vehical{
    public void start(){
        System.out.println("car is starting");
    }
}

class Bike implements Vehical{
    public void start(){
        System.out.println("bike is starting");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        Bike bike = new Bike();
        bike.start();
    }
}
