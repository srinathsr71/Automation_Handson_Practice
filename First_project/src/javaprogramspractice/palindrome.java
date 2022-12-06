package javaprogramspractice;

public class palindrome {
	
	public static void main(String args[]) {
	int n=225,sum=0,rem;
	int temp=n;
	while(n>0) {
		rem=n%10;
		sum=(sum*10)+rem;
		n=n/10;
	}
	if(temp==n) {
		System.out.println("number is palindrome");
	}else
	{
		System.out.println("the number is not a palindrome");
	}
	}

}
