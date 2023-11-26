/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package avalicaosemestral;

import avalicaosemestral.commerce.Cart;
import avalicaosemestral.commerce.ECommerce;
import avalicaosemestral.commerce.Item;
import avalicaosemestral.commerce.ItemQuantity;
import avalicaosemestral.delivery_methods.iLogistic;
import avalicaosemestral.factory.ItemFactory;
import avalicaosemestral.factory.LogisticFactory;
import avalicaosemestral.factory.PaymentFactory;
import avalicaosemestral.payment_methods.iPayment;

public class App {

    public static void main(String[] args) {
        PaymentFactory paymentFactory = new PaymentFactory();
        LogisticFactory logisticFactory = new LogisticFactory();
        ItemFactory itemFactory = new ItemFactory();
        Cart cart = new Cart();
        
        ItemQuantity itemQuantity = itemFactory.getItem("Playstation", 1450.00, 2);
        cart.addItem(itemQuantity);

        iPayment payment = paymentFactory.getPayment("NuBank");

        payment.pagar();

        ECommerce eCommerce = new ECommerce(payment, cart);

        iLogistic entregador = logisticFactory.getLogistic("correio", "Rodovia Aníbal Khury, 12355", eCommerce);

        entregador.deliver();
        entregador.cancel();
    }
}
