package MyPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class myClass2 {
    public static void main(String[] args) throws IOException {
        int i; int j;
        System.out.println("enter your number");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        i=Integer.parseInt(br.readLine());
        //j=String.isDigit(br.readLine());
        System.out.println(i);
    }
}
