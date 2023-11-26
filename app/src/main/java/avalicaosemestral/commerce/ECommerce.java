package avalicaosemestral.commerce;

import avalicaosemestral.payment_methods.iPayment;

public class ECommerce {
    private iPayment payment;
    private Cart cart;

    public ECommerce(iPayment payment, Cart cart) {
        this.payment = payment;
        this.cart = cart;
    }

    public iPayment getPayment() {
        return payment;
    }

    public void setPayment(iPayment payment) {
        this.payment = payment;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
