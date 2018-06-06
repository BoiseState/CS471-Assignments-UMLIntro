package visitor;

public interface Visitor {

    void visit(Book element);

    void visit(CoffeeMug element);

    void visit(TravelMug element);
}
