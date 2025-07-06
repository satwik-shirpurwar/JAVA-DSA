public class poweroftwo {

    public static boolean poweroftwo(int n){
        if((n&n-1)==0){
            return true;
        }
        else{
            return false;
        }
    }    
    public static void main(String[] args) {
        
        int n=58;
        System.out.print(poweroftwo(n));

    }
    
}
