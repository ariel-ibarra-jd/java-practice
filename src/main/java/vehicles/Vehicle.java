package vehicles;

import java.util.ArrayList;

public class Vehicle implements VehicleInterface{

    private String Name;
    private Integer Speed;
    private ArrayList<String> Characteristics;
    private enum Color {
        name,
        hexCode
    }

    public Vehicle(String name){
        Characteristics = new ArrayList<String>();
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getSpeed() {
        return Speed;
    }

    public void setSpeed(Integer speed) {
        Speed = speed;
    }

    public ArrayList<String> getCharacteristics() {
        return Characteristics;
    }

    public void setCharacteristics(ArrayList<String> characteristics) {
        Characteristics = characteristics;
    }

    public void addCharacteristic(String characteristic) {
        Characteristics.add(characteristic);
    }

    public void drive(){
        System.out.print("Engine stared. You are now driving!!\n");
    }

    public void fillGas(){
        System.out.print(this.getName() + " is full of gas. Go travel around the world!\n");
    }

    public void speedUp(){
        System.out.print("Speeding up! watch out!\n");
    }

    public void buy(){
        System.out.print("New " + this.getName() + " acquired.\n");
    }

    public void order(){
        System.out.print(this.getName() + " ordered.\n");
    }

    public void info(){
        System.out.print("Fruit Type: " + this.getName() + "\n" + "Class: " + this.getClass() + "\n");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "Name='" + Name + '\'' +
                ", Speed=" + Speed +
                ", Characteristics=" + Characteristics +
                '}';
    }
}
