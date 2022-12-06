package sep28;

class Example{
    private  int id;private int salary;
    //to set the values using setter method
    public void set(int i,int j){
        id=i;
        salary=j;
        System.out.println(id);
        System.out.println(salary);
    }
    //to return the values using getter method
    public int get(){
        return id;
    }
}
public class getterandsetter {
    public static void main(String[] args) {
        Example e=new Example();
        e.set(23,40000);
        //e.get();
        System.out.println(e.get());
    }
}
