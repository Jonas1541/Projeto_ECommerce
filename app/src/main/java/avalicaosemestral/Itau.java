package avalicaosemestral;

public class Itau implements iPayment{

    @Override
    public void pagar() {
        System.out.println("Pago com cartão Itau!");
    }
    
}
