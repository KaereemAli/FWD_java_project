package fwd_sales_project;

public class InvoiceLine {

    private String item;
    private double price;
    private int count;
    private double lineTotal;
    private InvoiceHeader invoice;

    public InvoiceLine(String item, double price, int count, InvoiceHeader invoice) {
        this.item = item ;
        this.price = price;
        this.count = count;
        this.invoice = invoice;
        this.setLineTotal(this.count*this.price);
    }

    public InvoiceHeader getInvoice() {
        return invoice;
    }

    public void setInvoice(InvoiceHeader invoice) {
        this.invoice = invoice;
    }

    public String getProduct() {
        return item;
    }

    public void setProduct(String item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getLineTotal() {
        return lineTotal;
    }

    public void setLineTotal(double lineTotal) {
        this.lineTotal = lineTotal;
    }

}
