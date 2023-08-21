public class hierarcy {
    void h1(){
        System.out.println("HI H1 VISA");
    }
}
    class hierarcy1 extends hierarcy{
        void h2(){
            System.out.println("HI H2 VISA");
        }
    }
    
    class hierarcy2 extends hierarcy{
        void h3(){
            System.out.println("HI H3 VISA");
        }
    
    public static void main(String[] args) {
        hierarcy2 h=new hierarcy2();
        h.h1();
        h.h3();
    }  

    }

   