package fruits;

public class Fruit implements FruitInterface{

    private String[] Characteristics;
    private String Name;
    private enum Color {
        name,
        hexCode
    }
    private enum Taste {
        bitter, sweet
    }

    public Fruit(String name){
        Name = name;
    }

    public String[] getCharacteristics() {
        return Characteristics;
    }

    public void setCharacteristics(String[] characteristics) {
        Characteristics = characteristics;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void chop() {
        System.out.print("chop! chop!\n");
    }

    public void squeeze() {
        System.out.print("squeeze! squeeze!\n");
    }

    public void peel() {
        System.out.print("peel! peel!\n");
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
}
