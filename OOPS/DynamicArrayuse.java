public class DynamicArrayuse {
    
    public static void main(String[] args) {
        
        DynamicArray d = new DynamicArray();
        
        for(int i=1; i <100; i++){
            d.add(100+i);
        }

        System.out.println(d.size());
        System.out.println(d.get(98));
        d.set(3,170);
        System.out.println(d.get(3));
         
        while(!d.isEmpty()){
        System.out.println(d.removerLast());
        System.out.println("size - " + d.size());
        }

        

    }
}
