package avalicaosemestral.factory;

import avalicaosemestral.commerce.ECommerce;
import avalicaosemestral.delivery_methods.FedEx;
import avalicaosemestral.delivery_methods.Mail;
import avalicaosemestral.delivery_methods.iLogistic;

public class LogisticFactory {
    public iLogistic getLogistic(String logistic, String address, ECommerce eCommerce) {
        if (logistic.equalsIgnoreCase("Correio")) {
            return new Mail(address, eCommerce.getCart().getItems());
        } else if (logistic.equalsIgnoreCase("FedEx")) {
            return new FedEx(address, eCommerce.getCart().getItems());
        } else {
            return null;
        }
    }
}
