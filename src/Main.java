//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    /*
    Mi propuesta de implementacion es separar lo mas posible la funcionalidad
    calculando el impuesto por un lado, por otro imprimiento y aparte tener la factura
     */
        Invoice invoice = new Invoice(1514.50);
        Printer printer = new Printer(invoice, new Calculator(invoice));
        printer.printInvoice();
    }
}