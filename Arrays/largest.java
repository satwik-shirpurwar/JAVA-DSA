package Arrays;

public class largest {
    public static int getlargest(int num[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            if(largest<num[i]){
                largest=num[i];
            }
        }

        return largest;
    }
    public static void main(String args[]){
        int num[]={5,6,7,8,41,1,2,4};

        int result=getlargest(num);
        System.out.println(result);
    }
}
