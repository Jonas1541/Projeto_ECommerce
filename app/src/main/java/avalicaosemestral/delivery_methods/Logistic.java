package avalicaosemestral.delivery_methods;

import java.util.List;

import avalicaosemestral.commerce.ItemQuantity;

import java.util.ArrayList;

public abstract class Logistic implements iLogistic {

    private String address;

    private List<ItemQuantity> parcel = new ArrayList<>();

    public Logistic(String address, List<ItemQuantity> parcel) {
        this.address = address;
        this.parcel = parcel;
    }

    @Override
    public void deliver() {
        System.out.print("Entrega realizada ");
    }

    @Override
    public void cancel() {
        System.out.print("Entrega cancelada ");
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<ItemQuantity> getParcel() {
        return parcel;
    }

    public void setParcel(List<ItemQuantity> parcel) {
        this.parcel = parcel;
    }

}
