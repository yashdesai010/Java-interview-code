public class Uppercase {
    public static void main(String[] args) {
        String s="YASH";
        char c[]=s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if(Character.isUpperCase(c[i])){
                c[i]=Character.toLowerCase(c[i]);
            }
            else if(Character.isLowerCase(c[i])){
                c[i]=Character.toUpperCase(c[i]);
            }

        }
        System.out.println(c);

    }
}
