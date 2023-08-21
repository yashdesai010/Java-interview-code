public class innerclass {
    void display(){
        int data=10;
    }

    public class innerclasses{
        void displays(){
            System.out.println("noob"+10);
        }
    }
        public static void main(String[] args) {
            innerclass in=new innerclass();
            innerclass.innerclasses ii=in.new innerclasses();
            ii.displays();
        }
    }


