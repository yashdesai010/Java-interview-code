 interface  interfacesss {
    void run();
}
class girl implements interfacesss{
    public void run(){
        System.out.println("Running");
    }
    public static void main(String[] args) {
       interfacesss iff=new girl();
       iff.run(); 
    }
}
