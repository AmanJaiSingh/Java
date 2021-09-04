public class Complex {
    private int a;
    private int b;

    public Complex(int i,int j){
        this.a=i;
        this.b=j;
    }
    public void print(){
        if(b<0){
            System.out.println(this.a+" "+this.b+"i");
        }
        else{
        System.out.println(this.a+" + "+this.b+"i");
        }
    }
    public static Complex add(Complex c1,Complex c2){
        int newReal = c1.a + c2.a;
        int newImg  = c1.b + c2.b;
        Complex c3 = new Complex( newReal , newImg);
        return c3;
    }

    public static Complex sub(Complex c1,Complex c2){
        int newReal = c1.a - c2.a;
        int newImg  = c1.b - c2.b;
        Complex c3 = new Complex( newReal , newImg);
        return c3;
    }
    public static Complex multiply(Complex c1, Complex c2){
        int real = c1.a*c2.a-c1.b*c2.b;
        int imag = c1.a*c2.b+c1.b*c2.a;
        Complex c3 = new Complex(real, imag);
        return c3;
    }
}
