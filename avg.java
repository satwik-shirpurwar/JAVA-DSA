package Functions;

public class avg {
    public static int avg(int a,int b,int c){
    int avg=(a+b+c)/3;
    return avg;
    }

    public static void main(String[] args) {
        int result=avg(1,2,3); // return value of avg come here
        System.out.print(result);
    }
}
