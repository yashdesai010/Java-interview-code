import java.util.Arrays;

public class firstandsecondlarge {
    public static void main(String[] args) {
        int arr[]={1,2,4,6,8,20,100};
        Arrays.sort(arr);
        System.out.println("Largest element:"+arr[arr.length-1]);
        System.out.println("Second Largest element:"+arr[arr.length-2]);
    }
}
