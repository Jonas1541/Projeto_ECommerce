package avalicaosemestral.commerce;

import java.util.List;
import java.util.ArrayList;

public class Cart {
    private List<ItemQuantity> items = new ArrayList<>();

    public Cart() {
    }

    public List<ItemQuantity> getItems() {
        return items;
    }

    public void addItem(ItemQuantity item) {
        items.add(item);
    }

    public double getTotal() {
        double sum = 0;
        for(ItemQuantity iq : items) {
            sum += iq.getQuantity() * iq.getItem().getPrice();
        }
        return sum;
    }
}
