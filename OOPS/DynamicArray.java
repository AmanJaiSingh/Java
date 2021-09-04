public class DynamicArray {
    private int data[];
    int NextelementIndex;    

    public DynamicArray(){
        data = new int[5];
        NextelementIndex=0;
    }
    public int size(){
        return NextelementIndex;
    }
    public boolean isEmpty(){
        return NextelementIndex==0;
    }

    public int get(int i){
        if(i>=NextelementIndex){
            return -1;
        }
        return data[i];
    }

    public void set(int i, int elem){
        if(i>=NextelementIndex){
            return;
        }
        data[i]=elem;
    }

    public void add(int elem){
        if(NextelementIndex==data.length){
            doubleCapacity();
        }

        data[NextelementIndex]=elem;
        NextelementIndex++;
    }
    private void doubleCapacity(){
        int temp[]=data;
        data=new int[2*temp.length];
        for(int i=0;i<temp.length;i++){
            data[i]=temp[i];
        }
    }
    public int removerLast(){
        if(NextelementIndex==0){
            return -1;
        }
        int temp = data[NextelementIndex-1];
        data[NextelementIndex-1] = 0;
        NextelementIndex--;
        return temp;

    }


}