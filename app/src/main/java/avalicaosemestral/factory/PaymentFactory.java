package avalicaosemestral.factory;

import avalicaosemestral.payment_methods.Itau;
import avalicaosemestral.payment_methods.NuBank;
import avalicaosemestral.payment_methods.iPayment;

public class PaymentFactory {
    public iPayment getPayment(String tipoPagamento) {
        if (tipoPagamento.equalsIgnoreCase("Itau")) {
            return new Itau();
        } else if(tipoPagamento.equalsIgnoreCase("Nubank")) {
            return new NuBank();
        } else {
            return null;
        }
    }
}
