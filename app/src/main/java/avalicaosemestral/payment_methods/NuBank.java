package avalicaosemestral.payment_methods;

public class NuBank implements iPayment{

    @Override
    public void pagar() {
        System.out.println("Pago com o cartão NuBank!");
    }
    
}
