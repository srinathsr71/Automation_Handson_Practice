package sep30;
class ede{
    int d;
    public  int cal(int x,int y){
         d=8;
        //System.out.println(d);
        return x+y;
    }
}
class ede1 extends ede{
    ede s=new ede();
    int se=s.d+4;
    //e.cal(d)
    //System.out.println(s.su)

}

public class ch {
    public static void main(String[] args) {
        ede1 e=new ede1();
        System.out.println(e.se);
    }
}
