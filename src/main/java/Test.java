import fruits.*;
import vehicles.*;

public class Test {
    public static void main(String[] args){
//        fruitsMethods();
        carMethods();
    }

    private static void carMethods(){
        VehicleFactory factory = new VehicleFactory();
        Car car = factory.getVehicle(Car.class);

        System.out.print("\n=====\n");

        car.buy();
        car.fillGas();
        car.drive();
        car.speedUp();

        car.setSpeed(120);
        car.addCharacteristic("small");
        car.addCharacteristic("fast");
        System.out.print("Speed: " + car.getSpeed() + "\n");
        System.out.print(car.toString() + "\n");

        System.out.print("\n=====\n");
    }

    private static void fruitsMethods(){
        FruitFactory factory = new FruitFactory();
        // Fruit apple = factory.getApple() \\ factory.get("Apple");
        Apple apple = factory.getFruit(Apple.class);
        Orange orange = factory.getOrange();
        Kiwi kiwi = factory.getKiwi();


        System.out.print("\n=====\n");

        apple.order();
        apple.buy();
        apple.chop();
        apple.info();
        apple.test();

        System.out.print("\n=====\n");

        kiwi.order();
        kiwi.buy();
        kiwi.chop();
        kiwi.info();

        System.out.print("\n=====\n");

        orange.order();
        orange.buy();
        orange.chop();
        orange.info();

        System.out.print("\n=====\n");
    }
}
