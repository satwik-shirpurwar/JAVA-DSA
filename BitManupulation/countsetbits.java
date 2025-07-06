public class countsetbits {

    public static int count(int n){

    int count=0;    
    while(n>0){

     if((n&1)!=0){// lsb is not equal to zero(checking least significant bit)
        count++;
     }
     n=n>>1;       

    }
    return count;


    }

    public static void main(String[] args) {

            System.out.print(count(8)); 

    }
    
}
