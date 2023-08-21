import java.util.HashMap;
import java.util.Map;

public class hashmapp {
    public static void main(String[] args) {
        HashMap<Integer,String> hp=new HashMap<>();
        hp.put(6,"Kahaan");
        hp.put(3, "Yash");
        hp.put(2,"Jaina");
        hp.put(1, "Vrushang");
        hp.put(4, "Nand");
        hp.put(5, "Krupa");
    
    for(Map.Entry m:hp.entrySet()){
        System.out.println(m.getKey()+":"+m.getValue());
    }
    //System.out.println(hp.get(1));
}
}