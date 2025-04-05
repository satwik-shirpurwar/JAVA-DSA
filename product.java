package Functions;
import java.util.*;
public class product {

    public static int Pro(int num1,int num2){
      int product=num1*num2;
      
      return product;  // Pro madhe jaate value
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int product=Pro(a,b); // 5*3=15 store hot aahe 
        System.out.print("Product is"+product);


    }
}
