
public class evenorodd {
    
    public static void evenodd(int num){
        int bitmask=1;
        if((num & bitmask)==1){
            System.out.print("Number is odd");
        }
        else{
            System.out.print("Number is even");
        }
    }

    public static void main(String[] args) {
        
        evenodd(45);
        evenodd(56);
        evenodd(89);
    }
}
