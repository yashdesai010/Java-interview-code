public class typecast {
    public static void main(String[] args) {
        int num=1;
        System.out.println(num);
        float data=num;//Widening typecasting
        long data1=(long)num;//Narrowing typecasting
        System.out.println(data1);
        System.out.println(data);
    }
}
