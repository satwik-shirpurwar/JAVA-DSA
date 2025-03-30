package Arrays;

public class kadanes {

    public static void kadanes(int num[]){
        int maxs=Integer.MIN_VALUE;
        int currsum=0;

        for(int i=0;i<num.length;i++){
            currsum=currsum+num[i];
            if(currsum<0){
                currsum=0;
            }

            maxs=Math.max(currsum,maxs);
        }


        System.out.println(maxs);
    }

    public static void main(String[] args) {
        int num[]={-2,-3,4,-1,-2,1,5,-3};
        kadanes(num);
    }
    
}
