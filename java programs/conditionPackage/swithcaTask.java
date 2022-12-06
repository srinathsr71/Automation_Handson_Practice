package conditionPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swithcaTask {
    public static void main(String[] args) throws IOException {
        int a,b,s;
        System.out.println("enter two numbers");
        BufferedReader brd=new BufferedReader(new InputStreamReader(System.in));
        a=Integer.parseInt(brd.readLine());
        b=Integer.parseInt(brd.readLine());
        s=Integer.parseInt(brd.readLine());
        switch (s){
            case 1:
                //operations
                if(a<b) {
                    System.out.println(a + b);
                }
                break;
            case 2:
                //operations
                if(a>b) {
                    System.out.println(a - b);
                }
                break;
            case 3:
                //operations
                if(a==b) {
                    System.out.println("both are equal");
                }
                break;
//            case 4:
//                //operations
//                if(a%2==0) {
//                    System.out.println("the number is even");
//                }
//                else{
//                    System.out.println("the number is odd");
//                }
//                break;
        }
        System.out.println("your giving wrong number");
    }
}
