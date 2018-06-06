package strategy;

/**
 * Run main() to see how to use the classes in this package.
 */
public class Demo {

    public static void main(String[] args) {
        SortableFormat sortableStrategy = new SortableFormat();
        String input[] = {"John Doe", "Smith, Bob", "McCartny, James Paul"};
        
        for (String rawName : input) {
            System.out.println("For raw name " + rawName);
            Person person = new Person(rawName);
            System.out.println("    Default Format: " + person.getFormattedName());
            
            person.setFormatStrategy(sortableStrategy);
            System.out.println("    Sortable Format: " + person.getFormattedName());    
        }
        
        
    }

}
