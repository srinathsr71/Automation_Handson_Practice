package sep28;
class New{
    int t;int r;String s;int value;int val;int m;int n;int pattern;
    public void test(){
        System.out.println("Welocome to Inheritance");
    }
    public void test1(){
        System.out.println(t+r);
        System.out.println(t-r);
        System.out.println(t*r);
    }
}
class Old extends  New{
    public void test2(){
        if(t%2==0){
            System.out.println("t is even");
        }else{
            System.out.println("t is odd");
        }
    }
    public  void test3(){
        for(int i=1;i<value;i++){
            System.out.print(i+1 + " ");//print the even numbers from 1 to 100.
            i++;
        }
        System.out.println();
        for(int j=1;j<val;j++){
            System.out.print(j+ " ");//print the odd numbers from 1 to 100.
            j++;
        }
    }
}
class Exist extends  New{
    public void pat(){
        //printing Hill pattern
        for(int m=1;m<=pattern;m++){
            for(int n=m;n<=pattern;n++){
                System.out.print(" ");
            }
            for(int n=1;n<m;n++){
                System.out.print("*");
            }
            for(int n=1;n<=m;n++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
public class test56Inher {
    public static void main(String[] args) {
        //Creating a First Class Object
        New n=new New();
        //assign a values
        n.t=34;n.r=23;
        //accessing the methods of First class
        n.test();
        n.test1();
        //creating a Second class Object
        Old o=new Old();
        //assign values
        o.t=35;o.value=100;o.val=100;
        //accessing the methods of Second class
        o.test2();
        o.test3();
        //Creating a Third class object
        Exist e=new Exist();
        //assign values
        e.pattern=5;
        //accessing the methods
        e.pat();
    }
}
