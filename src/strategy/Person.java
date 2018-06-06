package strategy;

/**
 * This is the 'context' of the strategy pattern.
 */
public class Person {

    private final String rawName;
    private FormatStrategy strategy;
    
    public Person(String rawName) {
        this.rawName = rawName;
        this.strategy = new DefaultFormat();
    }
    
    public Person(String rawName, FormatStrategy formatter) {
        this.rawName = rawName;
        this.strategy = formatter;
    }
    
    public String getRawName() {
        return rawName;
    }
    
    public void setFormatStrategy(FormatStrategy strategy) {
        this.strategy = strategy;
    }
    
    public String getFormattedName() {
        return strategy.formatName(this);
    }
    
}
