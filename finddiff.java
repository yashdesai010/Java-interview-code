import java.util.ArrayList;
import java.util.TreeSet;

public class finddiff {
    public static void main(String[] args) {
        String s1="yash";
        String s2="yashq";
        char ch1[]=s1.toCharArray();
        char ch2[]=s2.toCharArray();
        ArrayList<Character> t1=new ArrayList<>();
        for(Character cc:ch1){
            t1.add(cc);
        }
        System.out.println(t1);

        ArrayList<Character> t2=new ArrayList<>();
        for(Character ccc:ch2){
            t2.add(ccc);
        }
        System.out.println(t2);
        if(t1.equals(t2)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
