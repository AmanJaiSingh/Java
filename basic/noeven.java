import java.util.Scanner;
public class noeven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a =s.nextInt();
        int i=2 ;
        int sum=0;
        while(i<=a){
            sum=sum+1;
            i=i+2;
        }
        System.out.println(sum);
    }
}
