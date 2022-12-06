package sep28;

public class test4arrayList {
    //dynamic arrayList to declare
    public static int prod(int... numbers) {
        int pro = 1;//for multiplication of array
        for (int j = 0; j < numbers.length; j++) {
            //  sum=sum+a[j];//addition of array
            pro = pro * numbers[j];//for multiplication of array
        }
        //System.out.println(sum);
        return pro;
    }
//static array to declare
//    public static int pro(int[] num) {
//        int sum = 0;//for multiplication of array
//        for (int j = 0; j < num.length; j++) {
//            //  sum=sum+a[j];//addition of array
//            sum = sum * num[j];//for multiplication of array
//        }
//        //System.out.println(sum);
//        return sum;
//    }

    public static void main(String[] args) {
        test4arrayList tarr = new test4arrayList();
//        //int t=System.out.println(10);
//        int t = tarr.prod(2, 3, 4, 5, 6, 7, 7,89,48);
//        //dynamically giving the any values  by assign the  parameter as arraylist
//        System.out.println(t);
//        int [] a={2,4,5,6,7,7,8};
//        int y=tarr.pro(a);
//        System.out.println(y);
        System.out.println(tarr.prod(3,4,5,6,6,7,7));


    }
}
