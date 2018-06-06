package strategy;

public class SortableFormat extends FormatStrategy {

    @Override
    public String formatName(Person p) {
        String rawName = p.getRawName();
        String firstName = parseFirstName(rawName);
        String lastName = parseLastName(rawName);
        
        return lastName + ", " + firstName;
    }
}
