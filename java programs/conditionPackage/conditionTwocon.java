package conditionPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class conditionTwocon {
    public static void main(String[] args) throws IOException {
        int a; int b;
        System.out.println("enter the two numbers");
        BufferedReader brd=new BufferedReader(new InputStreamReader(System.in));
        a=Integer.parseInt(brd.readLine());
        b=Integer.parseInt(brd.readLine());
        if (a>b){       // >=, <=
            System.out.println(a-b);
        }
        else if (a<b){
            System.out.println(a*b);
        }
        else if(a==b){
            System.out.println("both are equal");
        }
        else {
            System.out.println("not equal");
        }
    }
}
