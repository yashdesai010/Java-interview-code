public class name {
    String name;

    String getname(){
        return name;
    }
    void setname(String name){
        this.name=name;
    }
    public static void main(String[] args) {
    name n=new name();
    n.setname("Yash");
    System.out.println(n.getname());
}
}
