public class Vowel {
    public static void main(String[] args) {
        String s="wwe";
        int Count=0;
        if(s.contains("a")||s.contains("e")||s.contains("i")||s.contains("o")||s.contains("u")){
            System.out.print("Vowel:");
            Count++;
            System.out.println(Count);
        }
        else{
            System.out.println("Consonant");
            
        }
    }
}
