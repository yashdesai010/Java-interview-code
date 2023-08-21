import java.util.TreeSet;

public class Removeduplicatefromarr {
    public static void main(String[] args) {
        int arr[]={1,1,5,4,3,1,2};
        TreeSet<Integer> ts=new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            ts.add(arr[i]);
            
        }
        System.out.println(ts);
    }
}
