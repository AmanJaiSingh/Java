import java.util.Scanner;
public class noodd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a =s.nextInt();
        int i=1 ;
        int sum=0;
        while(i<=a){
            sum=sum+1;
            i=i+2;
        }
        System.out.println(sum);
    }
}