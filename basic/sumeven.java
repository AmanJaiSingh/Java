import java.util.*;
public class sumeven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a =s.nextInt();
        int i=2 ;
        int sum=0;
        while(i<=a){
            sum=sum+i;
            i=i+2;
        }
        System.out.println(sum);
    }
}
