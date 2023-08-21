public class newprime {
    public static Boolean validate(final Integer prime){
        for (int i = 2; i <(prime/2); i++) {
            if(prime%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(validate(1));
    }
}
