public class primefactor {
    public static void main(String[] args) {
        int number=81;
        for(int i=2;i<number;i++){
            while(number%i==0){
                System.out.println(i+"");
                number=number/i;
            }
        }
        if(number>2){
            System.out.println(number);
        }
    }
}
