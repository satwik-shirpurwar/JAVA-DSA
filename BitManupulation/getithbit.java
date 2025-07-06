

public class getithbit {

    public static int getibit(int n,int i){
        int bitmask=1<<i;
        if((n&bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static int setithbit(int n,int i){
        int bitmask=1<<i;
        return n|bitmask;
          
    }

     public static int clearithbit(int n,int i){
        int bitmask=~(1<<i);
        return n & bitmask;
          
    }

     public static int updatebit(int n,int i,int newbit){
        if(newbit==0){
            return clearithbit(n, i);
        }
        else{
            return setithbit(n, i);
        }
          
    }

     public static int clearlastibits(int n,int i){
        
        int bitmask=((-1)<<i);
        return n & bitmask;
          
    }

    public static int clearrangeofbits(int n,int i,int j){
        
        int a=((-1)<<j+1);
        int b=(1<<i)-1;
        return n & (a/b);
          
    }
    public static void main(String[] args) {
        System.out.println(getibit(2,3));
        System.out.println(setithbit(2,2));
        System.out.println(clearithbit(4,2));
        System.out.println(updatebit(9,2,1));
        System.out.println(clearlastibits(15,2));
        System.out.println(clearrangeofbits(10,2,4));
    }
}
