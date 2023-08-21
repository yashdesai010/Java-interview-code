import java.util.HashMap;
import java.util.Map;

public class duplicateelementhash {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 3, 2, 5, 6, 7, 8, 9, 8 };

        Map<Integer, Integer> elementFrequency = countElementFrequency(array);

        System.out.println("Duplicate Elements:");
        for (Map.Entry<Integer, Integer> entry : elementFrequency.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }

    public static Map<Integer, Integer> countElementFrequency(int[] array) {
        Map<Integer, Integer> elementFrequency = new HashMap<>();

        for (int num : array) {
            elementFrequency.put(num, elementFrequency.getOrDefault(num, 0) + 1);
        }

        return elementFrequency;
    }
}
