package homeworkweek9;

import java.util.ArrayList;

public class Programme5 {
    public static void main(String[] args) {
        ArrayList<String> carList = new ArrayList<>();
        carList.add("BMW");
        carList.add("RangeRover");
        carList.add("Mercedes");
        carList.add("Tesla");
        carList.add("Volvo");
        carList.add("Audi");

        System.out.println("ArrayList: " + carList);
        System.out.println("Iterating over ArrayList using for loop:   ");
        int i;
        for (i = 0; i < carList.size(); i++) ;
        System.out.println(carList.get(i));
        System.out.println(",");

    }
}
