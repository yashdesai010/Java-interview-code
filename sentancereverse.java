public class sentancereverse {
    public static void main(String[] args) {
        String s[]="yash desai".split(" ");
        String rev="";
        for (int i = 0; i < s.length; i++) {
            rev=s[i]+rev;
        }
        System.out.println(rev);
    }
}
