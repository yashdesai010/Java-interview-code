public class sumofdigits {
    public static void main(String[] args) {
        int digit=111;
        int sum=0,r;
        while(digit>0){
            r=digit%10;
            sum=sum+r;
            digit/=10;
        }
        System.out.println(sum);
    }
}
