package visitor;

import java.util.List;

public class ReceiptBuilder implements Visitor {

    private StringBuilder buffer;

    @Override
    public void visit(Book b) {
        buffer.append("Book " + b.getISPN() + ": " + b.getTitle() + "\n");
        buffer.append(String.format("\t$%.02f\n", b.getPrice()));
    }

    @Override
    public void visit(CoffeeMug mug) {
        buffer.append("Coffee Mug " + mug.getUPC() + ": " + mug.getDescription() + "\n");
        buffer.append(String.format("\t$%.02f\n", mug.getPrice()));
    }

    @Override
    public void visit(TravelMug mug) {
        buffer.append("Coffee Mug " + mug.getUPC() + ": " + mug.getDescription() + "\n");
        buffer.append(String.format("\t$%.02f\n", mug.getPrice()));
        buffer.append(" *** Use promo code '" + mug.getPromoCode() + "' for travel discounts! ***\n");
    }

    public void printReceipt(List<Element> shopingCart) {
        buffer = new StringBuilder();
        for (Element item : shopingCart) {
            item.accept(this);
        }
        System.out.println(buffer.toString());
        buffer = null;
    }

}
