public class complesuse {
    public static void main(String[] args) {
        Complex c1 =new Complex(4,5);
        Complex c2 =new Complex(6,7);
        c1.print();
        Complex c3= Complex.add(c1,c2);
        c3.print();
        Complex c4=Complex.sub(c1,c2);
        c4.print();
        Complex c5=Complex.multiply(c1,c2);
        c5.print();
    }
}
