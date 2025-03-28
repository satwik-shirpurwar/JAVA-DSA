package Functions;
import java.util.*;

public class primes {

 public static boolean isprime(int a){
    if (a==2){
        return true;
    }

    for(int i=2;i<=a-2;i++){
        if(a%i==0){
            return false;
        }
       
    }
    return true;
 }

 public static void primerange(int n){
    for(int i=2;i<=n;i++){
        if(isprime(i)){ //true
            System.out.print(i+" ");
        }
    }
 }

    public static void main(String args[]){
       primerange(20);
    }
}
