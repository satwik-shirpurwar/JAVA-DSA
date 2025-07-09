import java.util.*;

public class Lonely {
    public static ArrayList<Integer> findLonely(ArrayList<Integer> nums){
        Collections.sort(nums);

        ArrayList<Integer> list = new ArrayList<>(); // result list

        // Middle elements
        for(int i=1; i<nums.size()-1; i++){
            if(nums.get(i) != nums.get(i+1) 
                && nums.get(i) != nums.get(i-1)
                && nums.get(i)+1 != nums.get(i+1)
                && nums.get(i)-1 != nums.get(i-1)){
                list.add(nums.get(i));
            }
        }

        // First element
        if(nums.size() >= 1){
            if(nums.size() == 1){
                list.add(nums.get(0));
            } else if(nums.get(0) != nums.get(1) && nums.get(0)+1 != nums.get(1)){
                list.add(nums.get(0));
            }
        }

        // Last element
        if(nums.size() > 1){
            if(nums.get(nums.size()-1) != nums.get(nums.size()-2) 
                && nums.get(nums.size()-1) - 1 != nums.get(nums.size()-2)){
                list.add(nums.get(nums.size()-1));
            }
        }

        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(10, 6, 5, 8));
        System.out.println(findLonely(nums)); // Output: [10, 8]
    }
}
