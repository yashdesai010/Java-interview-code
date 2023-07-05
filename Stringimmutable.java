public class Stringimmutable {
    public static void main(String[] args) {
     String s="yash";
     s.concat("Desai");
     System.out.println(s);   //it will create memory in heap as a yashDesai but variable s won't reference to it.
    }
}
