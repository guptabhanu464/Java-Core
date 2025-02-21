package solid.OCP;

public class CSVInvoicePrinter implements InvoicePrinter {


    @Override
    public void printInvoice() {
        System.out.println("Printing CSV Invoice Printer");
    }
}
