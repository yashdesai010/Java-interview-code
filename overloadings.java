public class overloadings {
    static int addition(int a,int b){
        return a+b;
    }
    static float addition(float a,float b,float c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(addition(2, 2, 4));
        System.out.println(addition(2, 2));
    }
}
