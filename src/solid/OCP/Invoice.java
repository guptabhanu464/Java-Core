package solid.OCP;

public class Invoice {

    public void genenrateInvoice(String type) {

        if (type.equals("PDF")) {
            System.out.println("Generating Invoice in PDF format");
        } else if (type.equals("CSV")) {
            System.out.println("Generating Invoice in CSV format");
        }
    }

    // Here Principle of OCP is voilated
    // If in any case any new type is introduced . We have to make changes in existing class
}
