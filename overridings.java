public class overridings {
   void details(){
    System.out.println("Hi");
   }
}
   class display extends overridings{
      void details(){
         System.out.println("Hello");
      }
 public static void main(String[] args) {
   overridings ov=new overridings();
   ov.details();
   display d1=new display();
   d1.details();
   }

}
