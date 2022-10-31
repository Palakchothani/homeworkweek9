package homeworkweek9;

import java.util.HashMap;
import java.util.Map;

public class Programme9 {
    public static void main(String[] args) {
        Map<String, Integer> people = new HashMap<>();
        people.put("Palak", 20);
        people.put("John", 30);
        people.put("Charlie", 40);
        people.put("Peter", 50);
        people.put("Smith", 60);

        for (Map.Entry<String, Integer> elements : people.entrySet()) {
            System.out.println(elements.getKey() + ", " + elements.getValue());
        }
    }
}
