package avalicaosemestral;

public class PaymentFactory {
    iPayment getPayment(String tipoPagamento) {
        if (tipoPagamento.equalsIgnoreCase("Itau")) {
            return new Itau();
        } else if(tipoPagamento.equalsIgnoreCase("Nubank")) {
            return new NuBank();
        } else {
            return null;
        }
    }
}
