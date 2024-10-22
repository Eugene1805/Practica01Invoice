public class Printer {
    private Invoice invoice;
    private Calculator calculator;

    public Printer(Invoice invoice, Calculator calculator) {
        this.invoice = invoice;
        this.calculator = calculator;
    }

    public void printInvoice() {
        System.out.println("El monto de la factura es: " + invoice.getAmount() +
                " y su impuesto es de " + calculator.getTax());
    }
}
