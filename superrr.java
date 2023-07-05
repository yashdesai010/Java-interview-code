public class superrr {
    String name="Yash";
}
    class notsuper extends superrr{
        String surname="Desai";
    
    void display(){
        System.out.println("Name:"+super.name+" "+surname);
    }
    public static void main(String[] args) {
        notsuper ns=new notsuper();
        ns.display();
    }
    }
