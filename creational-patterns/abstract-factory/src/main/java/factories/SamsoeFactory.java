package factories;

import factories.AbstractFactory;
import products.Pants;
import products.Shirt;
import samsoe.SamsoePants;
import samsoe.SamsoeShirt;

public class SamsoeFactory extends AbstractFactory {
    
    @Override
    public Shirt createShirt(){
        return new SamsoeShirt();
    }
    
    @Override
    public Pants createPants(){
        return new SamsoePants();
    }
}
