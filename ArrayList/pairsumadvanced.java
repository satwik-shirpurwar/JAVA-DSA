import java.util.ArrayList;

public class pairsumadvanced {

    public static boolean sum(ArrayList<Integer> list,int target){
        int bp=-1;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }

        int lp=bp+1 ;//smallest
        int rp=bp;

        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }


            else if(list.get(lp)+list.get(rp)<target){
                lp=(lp+1)%list.size();
            }
            else{
                rp=(list.size()+rp-1)%list.size();
            }


        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.print(sum(list,16));
    }
    
}
