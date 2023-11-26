package avalicaosemestral;

public class ECommerce {
    private iPayment payment;

    public ECommerce(iPayment payment) {
        this.payment = payment;
    }

    public iPayment getPayment() {
        return payment;
    }

    public void setPayment(iPayment payment) {
        this.payment = payment;
    }
}
