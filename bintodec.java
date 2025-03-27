package Functions;

public class bintodec {
    public static void bintodec(int n){
        
        int power=0;
        int decimal=0;

        while(n>0){
            int lastdigit=n%10;
            decimal=decimal+(lastdigit*(int)Math.pow(2, power));
            power++;
            n=n/10;
        }

        System.out.print(decimal);
    }

    public static void main(String args[]){
        bintodec(100);
    }
}
