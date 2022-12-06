package sep30;
class test{
    int i; int j;
    public void t(){
        System.out.println("Parent class");
    }
}
class operations extends  test{
    public void operations(int i,int j){
        System.out.println(i+j);
        System.out.println(i-j);
        System.out.println(i*j);
        System.out.println(i/j);
    }
}
class result extends  operations{
    public  int oper(int i,int j){
        return i;

    }
}
public class taskInher {


}
