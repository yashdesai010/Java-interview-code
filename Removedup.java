import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Removedup {
    public static void main(String[] args) {
        String s="abcb";
        char ch[]=s.toCharArray();
        HashSet<Character> c=new HashSet<>();
        for (int i = 0; i < ch.length; i++) {
            c.add(ch[i]);
        }
        System.out.println(c);
    }
}
