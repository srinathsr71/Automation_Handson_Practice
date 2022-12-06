package conditionPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class conditionTask {
    public static void main(String[] args) throws IOException {
        int age;
        System.out.println("enter the age");
        BufferedReader brd=new BufferedReader(new InputStreamReader(System.in));
        age=Integer.parseInt(brd.readLine());
        if (age>=18){       // >=, <=
            System.out.println("elegible to vote");
        }
        else if (age<=12){
            System.out.println("you are a baby");
        }
        else {
            System.out.println("not elegible");
        }
    }
}
