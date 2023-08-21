public class palindrom {
    public static void main(String[] args) {
        String s="Race";
        String pali="";
        for (int i = 0; i < s.length(); i++) {
            pali=s.charAt(i)+pali;
        }
        System.out.println(pali);

        if(pali.equals(s)){
            System.out.println("Palindrom");
        }
        else{
            System.out.println("False");
        }

    }
}
