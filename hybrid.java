public class hybrid {
    void car(){
        System.out.println("HYUNDAI");
    }
}
    class hybrid1 extends hybrid{
        void bike(){
            System.out.println("BMW");
        }
    }
        class hybrid2 extends hybrid1{
            void spaceship(){
                System.out.println("TESLA");
            }
            public static void main(String[] args) {
                hybrid2 hp=new hybrid2();
                hp.spaceship();
                hp.bike();
                hp.car();
            }
        }
    

