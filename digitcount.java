public class digitcount {
    public static void main(String[] args) {
        int digit=12345604;
        int count=0;
        while(digit!=0){
            digit/=10;
            count++;
        }
        System.out.println(count);
    }
}
