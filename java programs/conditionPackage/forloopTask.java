package conditionPackage;

//public class forloopTask {
//    public static void main(String[] args) {
//        int i,j;
//        //int n=5;
//        for(i=1;i<=5;i++){
//            for(j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

//public class forloopTask {
//    public static void main(String[] args) {
//        for (int row = 1; row <= 5; row++) {
//            for (int col = 1; col <= row; col++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//    }
//
//}

//public class forloopTask {
//    public static void main(String[] args) {
//        int i,j;
//        //int n=5;
//        for(i=1;i<=5;i++){
//            for(j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }
//}

//Reverse pattern

//public class forloopTask {
//    public static void main(String[] args) {
//        int i,j;
//        int n=5;
//        for(i=1;i<=n;i++){
//            System.out.print(" ");
//            for(j=i;j<=n;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}


//public class forloopTask {
//    public static void main(String[] args) {
//        int i,j;
//        int n=5;
//        for(i=1;i<=n;i++)
//        {
//            for(j=i;j<=n;j++)//it will print the 5 spaces in the row.
//            {
//                System.out.print(" ");//print spaces only
//            }
//            for(j=1;j<=i;j++)
//            {
//                System.out.print("*"); //print stars in same row
//            }
//            System.out.println();
//        }
//    }
//}



//public class forloopTask {
//    public static void main(String[] args) {
//        int i,j;
//        int n=5;
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=i;j++)//it will print the 5 spaces in the row.
//            {
//                System.out.print(" ");//print spaces only
//            }
//            for(j=i;j<=n;j++)
//            {
//                System.out.print("*"); //print stars in same row
//            }
//            System.out.println();
//        }
//    }
//}

//hill pattern
//public class forloopTask {
//    public static void main(String[] args) {
//        int i,j;
//        int n=5;
//        for(i=1;i<=n;i++)
//        {
//            for(j=i;j<=n;j++)//it will print the 5 spaces in the row.
//            {
//                System.out.print(" ");//print spaces only
//            }
//            for(j=1;j<i;j++)
//            {
//                System.out.print("*"); //print stars in same row
//            }
//            for(j=1;j<=i;j++)
//            {
//                System.out.print("*"); //print stars in same row
//            }
//            System.out.println();
//        }
//    }
//}



//Reverse hill pattern
//public class forloopTask {
//    public static void main(String[] args) {
//        int i,j;
//        int n=5;
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=i;j++)//it will print the 5 spaces in the row.
//            {
//                System.out.print(" ");//print spaces only
//            }
//            for(j=i;j<n;j++)
//            {
//                System.out.print("*"); //print stars in same row
//            }
//            for(j=i;j<=n;j++)
//            {
//                System.out.print("*"); //print stars in same row
//            }
//            System.out.println();
//        }
//    }
//}

//Diamond Pattern
public class forloopTask {
    public static void main(String[] args) {
        int i,j;
        int n=5;
        for(i=1;i<n;i++)
        {
            for(j=i;j<=n;j++)//it will print the 5 spaces in the row.
            {
                System.out.print(" ");//print spaces only
            }
            for(j=1;j<i;j++)
            {
                System.out.print("*"); //print stars in same row
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("*"); //print stars in same row
            }
            System.out.println();
        }
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)//it will print the 5 spaces in the row.
            {
                System.out.print(" ");//print spaces only
            }
            for(j=i;j<n;j++)
            {
                System.out.print("*"); //print stars in same row
            }
            for(j=i;j<=n;j++)
            {
                System.out.print("*"); //print stars in same row
            }
            System.out.println();
        }
    }
}

