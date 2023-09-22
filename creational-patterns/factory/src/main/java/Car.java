public class Car extends Vehicle{
    
    private String fuelType;
    private int weight;
    private int maxSpeed;

    public Car(String fuelType, int weight, int maxSpeed) {
        this.fuelType = fuelType;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String getFuelType(){
        return this.fuelType;
    }
    
    @Override
    public int getWeight(){
        return this.weight;
    }
    
    public int getMaxSpeed(){
        return this.maxSpeed;
    }
    
    
}
