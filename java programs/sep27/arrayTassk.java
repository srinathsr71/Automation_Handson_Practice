package sep27;

public class arrayTassk {
    public static void main(String[] args){
        int[] a={3,4,5,6,7};
        //int sum=0;//for addition of array
        int sum=1;//for multiplication of array
        for(int j=0;j<a.length;j++){
          //  sum=sum+a[j];//addition of array
            sum=sum*a[j];//for multiplication of array
        }
        System.out.println(sum);
    }
}
