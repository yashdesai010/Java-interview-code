public class employee {
    int salary=12000;
    
}
    class designation extends employee
    {
        int bonus=2000;
    
    public static void main(String[] args) {
        designation emp=new designation();
        System.out.println("Salary:"+emp.salary);
        System.out.println("Bonus:"+emp.bonus);
    }
}
