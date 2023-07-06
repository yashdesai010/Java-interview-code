import java.util.HashSet;
import java.util.Set;

public class intersectionofarr {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 6 };
        int arr2[] = { 1, 2, 5, 6, 7 };
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for (int num : arr1) {
            s1.add(num);
        }
        for (int num : arr2) {
            if (s1.contains(num)) {
                s2.add(num);
            }
        }
        System.out.println(s2);
    }
}
