package homeworkweek9;

import java.util.ArrayList;
import java.util.List;

public class Programme7 {
    public static void main(String[] args) {
        List<String> undergroundTubeLine = new ArrayList<>();
        undergroundTubeLine.add("Jubilee Line");
        undergroundTubeLine.add("Metropolitan Line");
        undergroundTubeLine.add("Central Line");
        undergroundTubeLine.add("Piccadilly Line");
        undergroundTubeLine.add("Northern Line");
        undergroundTubeLine.add("Bakerloo Line");
        undergroundTubeLine.add("Victoria Line");
        undergroundTubeLine.add("Circle Line");
        undergroundTubeLine.add("Hammersmith and City Line");

        System.out.println("Original array list: " + undergroundTubeLine);
        System.out.println("Checking the above array list is empty or not! " + undergroundTubeLine.isEmpty());
        undergroundTubeLine.removeAll(undergroundTubeLine);
        System.out.println("Array list after remove all elements " + undergroundTubeLine);
        System.out.println("Checking the above array list is empty or not!" + undergroundTubeLine.isEmpty());


    }
}
