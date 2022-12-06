package MyPackage;

public class stringMethods {
    public static void main(String[] args) {
        String str="srinath";
        String str1="SRINATH";
        String str2="    srinath   ";
        char ch=' ';
        //to find out the length  of the str
        System.out.println(str.length());
        //to print the lowercase of the str1
        System.out.println(str1.toLowerCase());
        //to print the Uppercase of the str
        System.out.println(str.toUpperCase());
        //to remove the left and right space of the characters in the  str2
        System.out.println(str2.trim());
        //to add string into the declare string using concatenation operator
        System.out.println(str + "sr");
        //to combine two string using concatenation operator
        System.out.println(str+ch+str1);
        //to replace the string of old characters into new characters
        System.out.println(str.replace('s','S'));
        //to print portion of the string use substring
        System.out.println(str.substring(3,5));
        System.out.println(str.substring(3));
        //to print the position of the character
        System.out.println(str1.charAt(2));
        //to check two strings equal or not
        System.out.println(str.equals(str1));

    }
}
