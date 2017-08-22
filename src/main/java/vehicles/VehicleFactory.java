package vehicles;

public class VehicleFactory {
    public <T extends Vehicle> T getVehicle(Class<T> tClass){
        // que es reflection? no entiendo el concepto
        try {
            return tClass.getConstructor().newInstance();
        } catch (Exception e){
            throw new RuntimeException("Cannot create a vehicle of type: " + tClass, e);
        }
    }
}
