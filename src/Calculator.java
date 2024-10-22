public class Calculator {
    private Invoice invoice;
    private final double  tax = 0.18;
    public Calculator(Invoice invoice) {
        this.invoice = invoice;
    }

    public double calculateTax(Invoice invoice){
        return invoice.getAmount() * tax;
    }

    public double getTax() {
        return tax;
    }
}
