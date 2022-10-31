package homeworkweek9;

import java.util.ArrayList;

public class Programme4 {
    public static void main(String[] args) {
        ArrayList<String> colour = new ArrayList();
        colour.add("Red");
        colour.add("Blue");
        colour.add("Green");
        colour.add("Yellow");
        colour.add("Burgundy");
        colour.add("White");
        colour.add("Black");

        for (String s : colour) {
            System.out.println(s + ",");
        }

    }
}
