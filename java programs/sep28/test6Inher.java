package sep28;

class m {
     int a;
     int b;
     String s;

     public void evenorodd() {
         if (a % 2 == 0 && b % 2 == 0) {
             System.out.println("a is even");
         } else {
             System.out.println("b is odd");
         }
     }

     public void len() {
         System.out.println(s.length());
     }

 }
 public class test6Inher {
     public static void main(String[] args) {
         m te = new m();
         te.a = 21;
         te.b = 32;
         te.s = "srinath";
         te.evenorodd();
         te.len();
     }
 }
