public class plusone {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        for (int i=arr.length-1;i>=0;i--) {
            if(arr[i]<9){
                arr[i]++;
                System.out.println(arr[i]);

            }
            arr[i]=0;
        }
        arr=new int[arr.length+1];
        arr[0]=1;
        
    }
}
