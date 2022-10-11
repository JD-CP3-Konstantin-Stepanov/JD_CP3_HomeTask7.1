import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.Collections;

class Main {

    public final static String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
            "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, " +
            "quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. " +
            "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu " +
            "fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, " +
            "sunt in culpa qui officia deserunt mollit anim id est laborum.";

    private static String minMaxFunction(Collection<Integer> HashMapValues) {
        int max = -1;
        for (int value : HashMapValues) {
            if (value > max) {
                max = value;
            }
        }

        int min = Integer.MAX_VALUE;
        for (int value : HashMapValues) {
            if (value < min) {
                min = value;
            }
        }
        return ("Максимальное значение: " + max + " Минимальное значение: " + min);
    }

    private static String minMaxMethod(Collection<Integer> HashMapValues) {
        return ("Максимальное значение: " + Collections.max(HashMapValues) +
                " Минимальное значение: " + Collections.min(HashMapValues));
    }

    public static void main(String[] args) {

        Map<Character, Integer> charFrequency = new HashMap<>();
        for (int i = 0; i < loremIpsum.length(); i++) {
            if (loremIpsum.charAt(i) != ' ' && loremIpsum.charAt(i) != ','
                    && loremIpsum.charAt(i) != '.' && loremIpsum.charAt(i) != '!'
                    && loremIpsum.charAt(i) != '?' && loremIpsum.charAt(i) != '-') {
                if (!charFrequency.containsKey(loremIpsum.charAt(i))) {
                    charFrequency.put(loremIpsum.charAt(i), 1);
                } else {
                    charFrequency.replace(loremIpsum.charAt(i),
                            (charFrequency.get(loremIpsum.charAt(i)) + 1));
                }
            }
        }
        Collection<Integer> hashMapValues = charFrequency.values();

        System.out.println("Частота символов: " + charFrequency);
        System.out.println("Через функцию: ");
        System.out.println(minMaxFunction(hashMapValues));
        System.out.println("Через метод min() - max(): ");
        System.out.println(minMaxMethod(hashMapValues));

    }
}