import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s=new Scanner(System.in);
        int n= s.nextInt();
        int reverse,temp;
        reverse=0;
        for(int i = n;i>=0;i=i/10){
            temp=i%10;
            reverse =reverse *10+temp;
        }
        System.out.println(reverse);
	}
}
