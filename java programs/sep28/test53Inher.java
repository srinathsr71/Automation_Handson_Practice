package sep28;

class Operations{
    int a;int b;
    void m1(){
        System.out.println("Operaionts to be performed");
    }
    void m2(){
        System.out.println(a+b);
    }
}
class Multiply extends  Operations{
    void m3(){
        System.out.println(a*b);
    }
}
class sub extends Operations{
    void m4(){
        System.out.println(a-b);
    }
}
public class test53Inher {
    public static void main(String[] args) {
        Operations op=new Operations();
        op.a=23;op.b=35;
        Multiply m=new Multiply();
        m.a=22;m.b=12;
        sub s=new sub();
        s.a=34;s.b=11;
        op.m1();
        op.m2();
        m.m3();
        s.m4();
    }
}
