package conditionPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class switchTask {
    public static void main(String[] args) throws IOException {
        int book;
        System.out.println("enter which book you want");
        BufferedReader brd=new BufferedReader(new InputStreamReader(System.in));
        //a=Integer.parseInt(brd.readLine());
        //b=Integer.parseInt(brd.readLine());
        book=Integer.parseInt(brd.readLine());
        switch (book){
            case 1:
                //operations
                System.out.println("java language ");
                break;
            case 2:
                //operations
                System.out.println("software testing");
                break;
            case 3:
                //operations
                System.out.println("automation");
                break;
        }
        System.out.println("your given book number is wrong");
    }
}
