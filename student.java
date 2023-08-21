/**
 * demonstrate use of static keyword(student) 
 */
public class student {

    int id;
    String name;
    static String college="IIT";

    student(int i,String n){
        id=i;
        name=n;
    }
    void display(){
        System.out.println("Name,ID and college:"+id+","+name+" and "+college);
    }
    public static void main(String[] args) {
        student s1=new student(1,"Yash");
        student s2=new student(2,"Kahaan");
        s1.display();
        s2.display();
    }
}