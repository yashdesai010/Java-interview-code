public class superrr {
    String name="Yash";
}
    class notsuper extends superrr{
        String name="Kahaan";
    
    void display(){
        System.out.println("Name:"+super.name+","+name);
    }
    public static void main(String[] args) {
        notsuper ns=new notsuper();
        ns.display();
    }
    }
