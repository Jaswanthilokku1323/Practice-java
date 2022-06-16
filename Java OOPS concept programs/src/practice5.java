public class practice5 {
   int id=1;
    double salary=21000;
    String name="jaswanthi";
    void mark( ){}
    public static void main(String[] args) {
        practice5 obj1=new practice5( );
        practice5 obj2= new practice5();
        System.out.println(obj1.id);
        System.out.println(obj1.salary);
        System.out.println(obj1.name);

        System.out.println(obj2.id);
        System.out.println(obj2.salary);
        System.out.println(obj2.name);

    }
}
