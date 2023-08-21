import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
     Queue<Integer> q=new LinkedList<Integer>();
     //PriorityQueue pq=new PriorityQueue<>();
     q.add(1);
     q.add(2);
     System.out.println(q.remove());
     System.out.println(q);
    }

}
