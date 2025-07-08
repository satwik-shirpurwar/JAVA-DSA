
import java.util.*;


public class parisum {
    // Brute Force

/*public static boolean sum(ArrayList<Integer> list){

    for(int i=0;i<list.size();i++){
        for(int j=i+1;j<list.size();j++){
            int sum=list.get(i)+list.get(j);

            if(sum==5){
                return true;
            }
            
            
        }
    }
    return false;
 
}*/


// 2 pointer

public static boolean sum(ArrayList<Integer> list,int target){
    int lp=0;int rp=list.size()-1;

    while(lp!=rp){
        if(list.get(lp)+list.get(rp)==target){
            return true;
        }

        else if(list.get(lp)+list.get(rp)>target){
            rp--;
            
        }

        else{
            lp++;
        }
    }
    return false;
}



    public static void main(String args[]){

         ArrayList<Integer> list=new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.print(sum(list,56));

    }
}
