package fruits;

public class FruitFactory {

//    TODO: implentar generics
//    public Fruit<T> get(String fruitName){
//        return createFruit(fruitName);
//    }
//

    public <T extends Fruit> T getFruit(Class<T> tClass){
        // que es reflection? no entiendo el concepto
        try {
            return tClass.getConstructor().newInstance();
        } catch (Exception e){
            throw new RuntimeException("Cannot create a fruit of type: " + tClass, e);
        }
    }

    public Apple getApple(){
        return new Apple();
    }

    public Kiwi getKiwi(){
        return new Kiwi();
    }

    public Orange getOrange(){
        return new Orange();
    }
}
