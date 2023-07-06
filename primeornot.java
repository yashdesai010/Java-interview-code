public class primeornot {
    public static void main(String[] args) {
        int number=11;
        boolean isprime=true;
        if(number<=1){
            isprime=false;
        }
        else{
            for (int i = 2; i <=Math.sqrt(number); i++) {
                if(number%2==0){
                    isprime=false;
                }
            }
        }
        if(isprime){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}
