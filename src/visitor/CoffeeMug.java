package visitor;

public class CoffeeMug implements Element {

    private String upc;
    private String description;
    private double price;

    public CoffeeMug(String description, String upc, double price) {
        this.description = description;
        this.upc = upc;
        this.price = price;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getUPC() {
        return upc;
    }

    public String getDescription() {
        return description;
    }


    public double getPrice() {
        return price;
    }

}
