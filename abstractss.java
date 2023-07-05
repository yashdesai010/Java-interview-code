abstract class abstractss
{
abstract void run();
}
class boy extends abstractss{
    void run(){
        System.out.println("Running Hard");
    }
    public static void main(String[] args) {
        abstractss ab=new boy();
        ab.run();
    }
}