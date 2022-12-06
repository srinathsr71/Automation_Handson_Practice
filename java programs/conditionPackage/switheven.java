package conditionPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class switheven {
    public static void main(String[] args) throws IOException {
        int ch;
        System.out.println("enter the number");
        BufferedReader brd = new BufferedReader(new InputStreamReader(System.in));
        //a=Integer.parseInt(brd.readLine());
        //b=Integer.parseInt(brd.readLine());
        ch = Integer.parseInt(brd.readLine());
        switch (ch % 2) {
            case 0:
                //operations
                System.out.println("the number is even");
                break;
            case 1:
                //operations
                System.out.println("the number is odd");
                break;
            default:
                //operations
                System.out.println("the wrong number");
        }
    }
}