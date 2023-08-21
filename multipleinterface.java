interface Swimmer{
    void swim();
}
interface flyer
{
    void fly();
}

class duck implements Swimmer, flyer 
{

    
    public void swim(){
        System.out.println("Swimming");
    }
    public void fly(){
        System.out.println("Flying");
    }
   
}
class multipleinterface{
public static void main(String[] args) {
    duck d1=new duck();
    d1.swim();
    d1.fly();
}
}