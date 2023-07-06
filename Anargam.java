import java.util.Arrays;

public class Anargam {
    public static void main(String[] args) {
        String s1 = "race";
        String s2 = "care";
        if (s1.length() == s2.length()) {
            char[] ch1 = s1.toCharArray();
            char[] ch2 = s2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            boolean result = Arrays.equals(ch1, ch2);
            if (result) {
                System.out.println("Anargam");
            } else {
                System.out.println("Not");
            }
        }
    }
}
