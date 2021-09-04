import java.util.*;
public class sumodd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a =s.nextInt();
        int i=1 ;
        int sum=0;
        while(i<=a){
            sum=sum+i;
            i=i+2;
        }
        System.out.println(sum);
    }
}