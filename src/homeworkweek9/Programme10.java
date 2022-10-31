package homeworkweek9;

import java.util.HashMap;
import java.util.Map;

public class Programme10 {
    public static void main(String[] args) {
        HashMap<Integer, String> metropolitanLine = new HashMap<>();
        metropolitanLine.put(1, "BakerStreet");
        metropolitanLine.put(2, "Kings Cross");
        metropolitanLine.put(3, "MoorGate");
        metropolitanLine.put(4, "Liverpool");
        metropolitanLine.put(5, "Aldgate");
        metropolitanLine.put(6, "Great Portland Street");
        metropolitanLine.put(7, "Farringdon");
        metropolitanLine.put(8, "Barbican");
        for (Map.Entry<Integer, String> metropolitanline : metropolitanLine.entrySet()) {
            System.out.println(metropolitanline);


        }

    }
}
