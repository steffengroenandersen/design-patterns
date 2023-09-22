import java.util.ArrayList;

public class TestFactory {
    public static void main(String[] args){
        
        Vehicle car = VehicleFactory.getVehicle("Car", "Gasoline", 2500, 180);
        Vehicle motorcycle = VehicleFactory.getVehicle("Motorcycle", "Gasoline", 150,300);
        Vehicle plane = VehicleFactory.getVehicle("Plane", "Gasoline", 3000, 300);

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        
        vehicles.add(car);
        vehicles.add(motorcycle);
        vehicles.add(plane);
        
        for(Vehicle vehicle : vehicles){
            System.out.println(vehicle);
        }
    }
}
