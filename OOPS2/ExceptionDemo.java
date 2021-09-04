public class ExceptionDemo {
    // public static int fact(int n){
    public static int divide(int a, int b){
        if(b==0){
            throw new ArithmeticException();
        }
        else{
        return a/b;
        }
    }

    public static void main(String[] args) {
        // String s =null;
        //  System.out.println(s.length());
        // System.out.println(4/0);
        // System.out.println("Main");
        divide(10,0);
    }
}

