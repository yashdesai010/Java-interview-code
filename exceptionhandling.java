public class exceptionhandling {
    public static void main(String[] args) {
        try{
        int data=10/0;
        System.out.println(data);
        
        //String s=null;
        //System.out.println(s.length());//If we have a null value in any variable, performing any operation on the variable throws a NullPointerException.
        }
        catch(Exception e){
            System.out.println(e);
            //System.exit(0);
        }
       finally{
        System.out.println("Rest of the code");//no matter what the exception is it will run.except
        //you write System.exit in catch
    }
}
}
