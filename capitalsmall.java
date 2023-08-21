public class capitalsmall {
    public static void main(String[] args) {
        String s="Ab#$Cd";
        char ch[]=s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
           if(ch[i]>='a'&& ch[i]<='z'){
            System.out.print(Character.toUpperCase(ch[i]));
           }
           else{
            System.out.print(Character.toLowerCase(ch[i]));
           }
           
           
            }
            
        }
    }

