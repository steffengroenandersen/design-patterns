public abstract class Vehicle {
    
    public abstract String getFuelType();
    public abstract int getWeight();
    public abstract int getMaxSpeed();
    
    @Override
    public String toString(){
        return "Fuel type: " + this.getFuelType() + ", Weight: " + this.getWeight() + ", Max speed: " + getMaxSpeed();
    }



}
