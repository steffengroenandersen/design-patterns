public class VehicleFactory {
    public static Vehicle getVehicle(String vehicleType, String fuelType, int weight, int maxSpeed){
        if(vehicleType.equalsIgnoreCase("Car")){
            return new Car(fuelType, weight, maxSpeed);
            
        } else if(vehicleType.equalsIgnoreCase("Motorcycle")){
            return new Motorcyle(fuelType, weight, maxSpeed);
        
        } else if(vehicleType.equalsIgnoreCase("Plane")){
            return new Plane(fuelType, weight, maxSpeed);
        
        } else {
            return null;
        }
        
    }
}
