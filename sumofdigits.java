package Functions;

public class sumofdigits {

    public static void sumofdigits(int x){
        int sum=0;
        while(x>0){

            int lastdigit=x%10;
            sum=sum+lastdigit;
            x=x/10;
        }

        System.out.print(sum);
    }
    public static void main(String args[]){
      sumofdigits(801);
    }
}
