import java.util.Scanner;
public class positive {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        //Scanner s = new Scanner(System.in);
        /*int a,b,c;
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        int i = a;
        double j;
        while(i<=b){
            j = (i-32)*(5/9);
            System.out.println(i+" "+j);
            i=i+c;*/
        /*int a,b;
        a = s.nextInt();
        b = 2;
        Boolean z= true;
        while(b<a){
            if((a%b)==0){
               
                z=false;
            }
            b=b+1;
        }
        if(z){
            System.out.println("prime");
        }else{
            System.out.println("Composite");
        }*/
        Scanner s= new Scanner(System.in);
        float salary = s.nextFloat();
        String allow = s.next();
        char h = allow.charAt(0);
        int l =h;
        float hra , da , pf, Allow ,ttlsal;
        hra =(salary/100)*20;
        da =(salary/100)*50;
        pf  =(salary/100)*11;
        if(l==65){
            Allow =1700;
        }else if(l==66){
            Allow = 1500;
        }else{
            Allow= 1300;
        }
        ttlsal=salary+hra+da+Allow-pf;
        if(ttlsal==(int)ttlsal){
        System.out.println((int)(ttlsal));
        }else if (ttlsal-(int)ttlsal<0.5){
            System.out.println((int)(ttlsal));
        }else{
            System.out.println((int)(ttlsal)+1);
        }
        


        
            
         
            
            																			
        

		
	}

}

