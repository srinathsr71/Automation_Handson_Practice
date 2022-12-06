package MyPackage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class operators {
    public static void main(String[] args) throws IOException {
        int i; int j;
        System.out.println("enter two number");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        i=Integer.parseInt(br.readLine());
        j=Integer.parseInt(br.readLine());
        int sum=i+j;
        int sub=i-j;
        int mul=i*j;
        int div=i/j;
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
    }
}

