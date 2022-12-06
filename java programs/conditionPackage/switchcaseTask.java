package conditionPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class switchcaseTask {
    public static void main(String[] args) throws IOException {
        int day;
        System.out.println("enter your day");
        BufferedReader brd=new BufferedReader(new InputStreamReader(System.in));
        day=Integer.parseInt(brd.readLine());
        //c=Integer.parseInt(brd.readLine());
        //s=Integer.parseInt(brd.readLine());
        switch (day){
            case 1:
                //operations
                System.out.println("monday");
                break;
            case 2:
                //operations
                System.out.println("tuesday");
                break;
            case 3:
                //operations
                System.out.println("wednesday");
                break;
            case 4:
                //operations
                System.out.println("Thrusday");
                break;
            case 5:
                //operations
                System.out.println("Friday");
                break;
            case 6:
                //operations
                System.out.println("saturday");
                break;
            case 7:
                //operations
                System.out.println("sunday");
                break;
            default:
                //operations
                System.out.println("you have entered wrong day");

        }
        System.out.println("srinath");
    }
}
