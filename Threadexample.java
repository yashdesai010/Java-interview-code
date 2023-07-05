public class Threadexample extends Thread{
        public void run(){
            System.out.println("Running");
        }
        public static void main(String[] args) {
            Threadexample te=new Threadexample();
            Thread t=new Thread();//using thread constructor
            t.start();
            te.start();
        }
    }

