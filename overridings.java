public class overridings {
   void details(){
    System.out.println("Hi");
   }
}
   class display extends overridings{
 public static void main(String[] args) {
    display d1=new display();
    d1.details();
 
   }

}
