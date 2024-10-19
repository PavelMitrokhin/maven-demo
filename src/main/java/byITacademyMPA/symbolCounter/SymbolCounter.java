package byITacademyMPA.symbolCounter;

import java.util.HashMap;
import java.util.Map;

public class SymbolCounter {
    public static void main(String[] args) {
        String text = "Ssssample 4 text";
        Map<Character, Integer> symbolCount = new HashMap<>();

        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
                symbolCount.put(ch, symbolCount.getOrDefault(ch, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : symbolCount.entrySet()) {
            System.out.println(entry.getKey() + " appears " + entry.getValue() + " time(s)");
        }
    }
}
