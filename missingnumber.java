public class missingnumber {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,4,7};
        int sum=0;
         int n=arr.length+1;
        int formula=n*(n+1)/2;

        for (int i = 0; i <arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(formula-sum);
    }
}
