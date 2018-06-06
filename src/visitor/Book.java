package visitor;

public class Book implements Element {

    private String isbn;
    private String title;
    private double price;

    public Book(String title, String isbn, double price) {
        this.title = title;
        this.isbn = isbn;
        this.price = price;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getISPN() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

}
