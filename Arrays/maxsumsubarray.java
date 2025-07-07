public class maxsumsubarray {


    public static void sumsubarray(int num[]){
        
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            int start =i;

            for(int j=i;j<num.length;j++){
                int end=j;
                int currsum=0;
                for(int k=start;k<=end;k++){
                    currsum+=num[k];
                }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }

        }

        System.out.println("Max Sum is "+maxsum);

    }

    public static void main(String args [] ){
        int num[]={2,4,6,8,10};
        sumsubarray(num);
    }
}
