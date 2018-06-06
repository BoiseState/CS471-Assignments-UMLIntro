package visitor;

import java.util.HashMap;

public class Inventory {

    private HashMap<String, Integer> books; // Mapped by ISPN
    private HashMap<String, Integer> coffeeMugs; // Mapped by UPC

    public Inventory() {
        books = new HashMap<>();
        coffeeMugs = new HashMap<>();
    }

    public void stockBook(Book b, int count) {
        Integer inStockCount = books.getOrDefault(b.getISPN(), 0);
        inStockCount += count;
        books.put(b.getISPN(), inStockCount);
    }

    public void sellBook(Book b) {
        Integer inStockCount = books.getOrDefault(b.getISPN(), 0);
        if (inStockCount < 1) {
            throw new IllegalStateException("Out of stock");
        }
        inStockCount--;
        books.put(b.getISPN(), inStockCount);
    }

    public void stockMug(CoffeeMug mug, int count) {
        Integer inStockCount = coffeeMugs.getOrDefault(mug.getUPC(), 0);
        inStockCount += count;
        coffeeMugs.put(mug.getUPC(), inStockCount);
    }

    public void sellMug(CoffeeMug mug) {
        Integer inStockCount = coffeeMugs.getOrDefault(mug.getUPC(), 0);
        if (inStockCount < 1) {
            throw new IllegalStateException("Out of stock");
        }
        inStockCount--;
        coffeeMugs.put(mug.getUPC(), inStockCount);
    }

    public void logStock() {
        System.out.println("Book Inventory:");
        for (String isbn : books.keySet()) {
            Integer stockCount = books.get(isbn);
            System.out.println("\t" + isbn + ": " + stockCount);
        }
        System.out.println("Coffe Mug Inventory:");
        for (String upc : coffeeMugs.keySet()) {
            Integer stockCount = coffeeMugs.get(upc);
            System.out.println("\t" + upc + ": " + stockCount);
        }
    }
}
