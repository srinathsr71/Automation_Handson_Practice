package conditionPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class switchcasTask {
    public static void main(String[] args) throws IOException {
        //Char c;
        System.out.println("enter your alphabet");
        BufferedReader brd=new BufferedReader(new InputStreamReader(System.in));
        String c=brd.readLine();
        switch (c)
        {

            case "a":
                //operations
                System.out.println("alphabet is a vowel");
                break;
            case "e":
                //operations
                System.out.println("alphabet is a vowel");
                break;
            case "i":
                //operations
                System.out.println("alphabet is a vowel");
                break;
            case "o":
                //operations
                System.out.println("alphabet is a vowel");
                break;
            case "u":
                //operations
                System.out.println("alphabet is a vowel");
                break;
            default:
                System.out.println("alphabet is a consonant");
        }
        //System.out.println("your giving wrong number");
    }
}
