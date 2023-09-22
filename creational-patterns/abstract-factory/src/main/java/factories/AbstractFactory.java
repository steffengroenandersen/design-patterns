package factories;

import products.Pants;
import products.Shirt;

public abstract class AbstractFactory {
    
    public abstract Shirt createShirt();
    
    public abstract Pants createPants();
}
