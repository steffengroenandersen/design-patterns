package factories;

import factories.AbstractFactory;
import minimum.MinimumPants;
import minimum.MinimumShirt;
import products.Pants;
import products.Shirt;

public class MinimumFactory extends AbstractFactory {
    
    @Override
    public Shirt createShirt(){
        return new MinimumShirt();
    }
    
    @Override
    public Pants createPants(){
        return new MinimumPants();
    }
    
    
}
