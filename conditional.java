import java.util.*;

public class conditional {
    
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);

        int age=sc.nextInt();
        System.out.println(age);

        if(age>=18){
            System.out.println("drive");
        }

        else{
            System.out.println("not Possible");
        }

    }
}
