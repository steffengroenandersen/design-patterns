import factories.AbstractFactory;
import factories.MinimumFactory;
import products.Pants;
import products.Shirt;
import factories.SamsoeFactory;

public class ApparelStore {
    public static void main(String[] args){

        AbstractFactory minimumFactory = new MinimumFactory();

        Shirt minimumShirt1 = minimumFactory.createShirt();
        Pants minimumPants1 = minimumFactory.createPants();
        
        
        AbstractFactory samsoeFactory = new SamsoeFactory();

        Shirt samsoeShirt1 = samsoeFactory.createShirt();
        Pants samsoePants1 = samsoeFactory.createPants();
        
        minimumShirt1.create();
        minimumPants1.create();
        
        samsoeShirt1.create();
        samsoePants1.create();
        
        
    }
}
