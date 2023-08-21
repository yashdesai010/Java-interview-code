/**
 * wordcount
 */
public class lettercount {

    public static void main(String[] args) {
        String s = "yash c desai";
        int count = 0;
        s=s.replaceAll("\\s+","");//ignore space
        for (int i = 0; i < s.length(); i++) {
            count++;
        }
        System.out.println(count);
    }
}