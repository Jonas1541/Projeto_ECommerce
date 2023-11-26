package avalicaosemestral.delivery_methods;

import java.util.List;

import avalicaosemestral.commerce.ItemQuantity;

public class Mail extends Logistic{

    public Mail(String address, List<ItemQuantity> parcel) {
        super(address, parcel);
    }

    @Override
    public void deliver() {
        super.deliver();
        System.out.println("pelos correios.");
    }

    @Override
    public void cancel() {
        super.cancel();
        System.out.println("pelos correios.");
    }
    
}
