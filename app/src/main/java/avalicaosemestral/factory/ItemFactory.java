package avalicaosemestral.factory;

import avalicaosemestral.commerce.Item;
import avalicaosemestral.commerce.ItemQuantity;

public class ItemFactory {
    public ItemQuantity getItem(String itemName, double itemPrice, int quantity) {
        Item item = new Item(itemName, itemPrice);
        return new ItemQuantity(item, quantity);
    }
}
