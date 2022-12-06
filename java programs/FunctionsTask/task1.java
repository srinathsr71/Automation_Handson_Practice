package FunctionsTask;

public class task1 {
//    public static void Multiply(int a, int b) {
//        System.out.println(a * b);
//    }
//
//    public static void main(String[] args) {
//        Multiply(13, 2);
//    }

//public static void Checking(int a){
//    if(a%2==0){
//        System.out.println("a is even");
//    }
//    else{
//        System.out.println("a is odd");
//    }
//}
//
//    public static void main(String[] args) {
//        Checking(13);
//    }


// integer value return using main method to display the values is another way.

//    public static int Multiply(int a, int b) {
//        int c, d;
//        c = a * b;
//        d = a + b;
//
//        return c;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(Multiply(13, 2));
//    }


//    another way to passing values for creating a object for class and display a values using main method
//    public static void test() {
//        System.out.println("java");
//    }
//
//    public static void test(int t) {
//        System.out.println("java" + t);
//    }
//
//    public static void test(String str) {
//        System.out.println(str + "java");
//    }
//
//    public static void Multiply(int a, int b) {
//        int c;
//        c = a * b;
//        System.out.println(c);
//    }
//
//    public static void main(String[] args) {
//        task1 ta = new task1();//creating a instance of the class
//        ta.test();
//        ta.Multiply(20, 6);
//        ta.test(9);//method -overloading
//        ta.test("Welcome to");
//
//    }

    public static void test(){
        System.out.println("java");
    }
    public static void test(int t,String str1){
        System.out.println("java" +t +str1);
    }
    public static void test(String str){
        System.out.println(str+ "java");
    }
    public static void test(int a, int b){
        int c;
        c=a*b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        task1 ta=new task1();//creating a instance of the class
        ta.test();
        ta.test(20,6);
        ta.test(9,"sai");//method -overloading
        ta.test("Welcome to");

    }

}
