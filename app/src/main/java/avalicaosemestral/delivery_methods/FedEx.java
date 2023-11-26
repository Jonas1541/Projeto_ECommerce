package avalicaosemestral.delivery_methods;

import java.util.List;

import avalicaosemestral.commerce.ItemQuantity;

public class FedEx extends Logistic{

    public FedEx(String address, List<ItemQuantity> parcel) {
        super(address, parcel);
    }

    @Override
    public void deliver() {
        super.deliver();
        System.out.println("pelo FedEx.");
    }

    @Override
    public void cancel() {
        super.cancel();
        System.out.println("pelo FedEx.");
    }
    
}
