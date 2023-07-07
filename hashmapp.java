import java.util.HashMap;
import java.util.Map;

public class hashmapp {
    public static void main(String[] args) {
        HashMap<Integer,String> hp=new HashMap<>();
        hp.put(2,"kahaan");
        hp.put(1, "yash");
    
    for(Map.Entry m:hp.entrySet()){
        System.out.println(m.getKey()+""+m.getValue());
    }
    System.out.println(hp.get(1));
}
}