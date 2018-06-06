package strategy;

/**
 * The 'Strategy' participant of the strategy pattern.
 */
public abstract class FormatStrategy {
    
    private String[] parseRawName(String rawName) {
        
        int commaIndex = rawName.indexOf(",");
        if (commaIndex < 0) {
            // No comma, assume space delimited names: FirstName [MiddleName...] [LastName]
            int lastSpaceIndex = rawName.lastIndexOf(" ");
            if (lastSpaceIndex < 0) {
                // Only one name, so add an empty string as the last name
                return new String[] {rawName, ""};
            }
            String first = rawName.substring(0, lastSpaceIndex).trim();
            String last = rawName.substring(lastSpaceIndex + 1).trim();
            return new String[] {first, last};
        }
        else {
            // Comma found, assume format of: LastName, FirstName [MiddleName...]
            String last = rawName.substring(0, commaIndex).trim();
            String first = rawName.substring(commaIndex + 1).trim();
            return new String[] {first, last};

        }
    }

    protected String parseFirstName(String rawName) {
        String[] parsed = parseRawName(rawName);
        return parsed[0];
    }
    
    protected String parseLastName(String rawName) {
        String[] parsed = parseRawName(rawName);
        return parsed[1];
    }
    
    public abstract String formatName(Person p);
}
