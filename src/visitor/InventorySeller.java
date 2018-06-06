package visitor;

import java.util.List;

public class InventorySeller implements Visitor {

    private Inventory inventory;

    public InventorySeller(Inventory inventory) {
        this.inventory = inventory;
    }

    @Override
    public void visit(Book b) {
        inventory.sellBook(b);
    }

    @Override
    public void visit(CoffeeMug mug) {
        inventory.sellMug(mug);
    }

    @Override
    public void visit(TravelMug mug) {
        inventory.sellMug(mug);
    }

    public void sell(List<Element> shopingCart) {
        for (Element item : shopingCart) {
            item.accept(this);
        }
    }
}
