import java.util.Stack;

public class STack {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.pop();
    System.out.println(s.peek());//return top element
    }
}
