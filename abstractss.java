abstract class abstractss{
abstract void list();{
}
}
class games extends abstractss{
    void list(){
        System.out.println("DMC,Sleeping Dogs,Call of duty");
    }

/**
 * Innerabstractss
 */

    public static void main(String[] args) {
        abstractss games=new games();
        games.list();
    }
}
        
            
        


