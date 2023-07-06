public class armstrong {
    public static void main(String[] args) {
        int digit = 153, r, sum = 0, temp;
        temp = digit;
        while (digit > 0) {
            r = digit % 10;
            sum = sum + (r * r * r);
            digit = digit / 10;
        }
        if (temp == sum) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not");
        }
    }
}
