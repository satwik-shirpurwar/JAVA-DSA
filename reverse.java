import java.util.*;

public class reverse {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int lastdigit;
        while(n>0){
            lastdigit=n%10; // GiVES LAST DIGIT
            System.out.print(lastdigit);
            n=n/10;// REMOVE LAST DIGIT
        }

        

    }
}
