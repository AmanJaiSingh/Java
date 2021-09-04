/**
 * Student
 */
public class Student {

    public String name;
    private int rollnumber;
    double cgpa;
    public final static double CF=0.95;
    private static int Studnum;
    
    public Student(String n, int num){
        this.name=n;
        this.rollnumber=num;
        Studnum++;
    }
    public Student(String n){
        this.name=n;
    }
    public Student(int num){
        this.rollnumber=num;
    }

    public Student(){
        this.name="Enter a valid name";
        this.rollnumber=333333333;
    }

    public void print(){
        System.out.println(name+"  "+rollnumber);
        
    }
    public static int getNumStudent(){
        return Studnum;
    }
    
    public int getRollNumber(){
        return this.rollnumber;
    }

    public void setRollNumber(int rollnumber){
        if (rollnumber<0){
            return;
        }
        this.rollnumber=rollnumber;
    }


}