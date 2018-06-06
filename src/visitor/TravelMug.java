package visitor;

public class TravelMug extends CoffeeMug {

    private String promoCode;

    public TravelMug(String description, String upc, double price, String promoCode) {
        super(description, upc, price);
        this.promoCode = promoCode;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getPromoCode() {
        return promoCode;
    }


}
