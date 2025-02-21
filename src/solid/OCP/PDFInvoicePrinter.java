package solid.OCP;

public class PDFInvoicePrinter implements InvoicePrinter{

    @Override
    public void printInvoice() {
        System.out.println("Printing PDF Invoice");
    }
}
