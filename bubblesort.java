public class bubblesort {
    public static void main(String[] args) {
        int arr[]={2,45,88,11,5};
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[i]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
           
        }
         System.out.print(arr[i]);
    }
    }
}