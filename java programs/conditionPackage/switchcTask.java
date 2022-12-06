package conditionPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class switchcTask {
    public static void main(String[] args) throws IOException {
        int a,b,s;
        System.out.println("enter your number");
        BufferedReader brd=new BufferedReader(new InputStreamReader(System.in));
        a=Integer.parseInt(brd.readLine());
        b=Integer.parseInt(brd.readLine());
        s=Integer.parseInt(brd.readLine());
        switch (s){
            case 1:
                //operations
                System.out.println(a+b);
                break;
            case 2:
                //operations
                System.out.println(a-b);
                break;
            case 3:
                //operations
                System.out.println(a*b);
                break;
        }
        System.out.println("your giving wrong number");
    }
}
