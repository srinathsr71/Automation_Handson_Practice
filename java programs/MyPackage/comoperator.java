package MyPackage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class comoperator {
    public static void main(String[] args) throws IOException {
        //int i,j;
//        System.out.println("enter two number");
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        i=Integer.parseInt(br.readLine());
//        j=Integer.parseInt(br.readLine());

        //checking the variables values equal or not
        int i=44; int j=55;
        System.out.println(i==j);

        //checking the variables values less than or not.
        int d=56; int e=36;
        System.out.println(d<e);

        //checking the variables values greater than or not.
        int y=23; int t=56;
        System.out.println(y>t);
        //checking the variables values not equal or not.
        int r=12; int l=98;
        System.out.println(r!=l);
    }
}

