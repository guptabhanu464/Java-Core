package solid.OCP;

public class InvoiceService {

    private InvoicePrinter invoicePrinter;

    public InvoiceService(InvoicePrinter printer) {
        this.invoicePrinter = printer;
    }

    public void print() {
        invoicePrinter.printInvoice();
    }

    public static void main(String[] args) {

        InvoicePrinter invoicePrinter1 = new CSVInvoicePrinter();
        invoicePrinter1.printInvoice();
        InvoicePrinter invoicePrinter2 = new PDFInvoicePrinter();
        invoicePrinter2.printInvoice();

    }

}
