package sep28;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test5 {
        public static int add(int[]n)
        {
            int sum=0,k;
            for(k=0;k<n.length;k++)
            {
                sum=sum+n[k];
            }
            return sum;
        }
        public static int product(int ...n)
        {
            int p=1,k;
            for(k=0;k<n.length;k++)
            {
                p=p*n[k];
            }
            return p;
        }
        public static void area(int r)
        {
            double a = 3.14*r*r;
            System.out.println("area of circle= "+a);
        }
        public static void perimeter(int r)
        {
            double b = 2*3.14*r;
            System.out.println("perimeter of circle= "+b);
        }
        public static void main(String[] args) throws IOException
        {
            System.out.print("Enter the value of radius= ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int r =Integer.parseInt(br.readLine());
            test5 c = new test5();
            int ad[] ={10,20,30,40};
            int z = c.add(ad);
            System.out.println("sum of number = "+z);
            int i=c.product(2,2,2,2,2,2,2,2,2);
            System.out.println("products of numbers = "+i);
            c.area(r);
            c.perimeter(r);
        }
    }

