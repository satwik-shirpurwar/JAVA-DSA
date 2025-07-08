import java.util.*;

public class first {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        // add element
       list.add(1);
       list.add(2);
       list.add(3);
    System.out.println(list);

        //get element
    int element=list.get(2);
    System.out.println(element);

        //Delete or remove
        list.remove(0);
        System.out.println(list);

        //Set Element at Index

        list.set(0, 3);
        System.out.println(list);

        // Contains Elements

        System.out.println(list.contains(3));

        // New add operation at an index

        list.add(0,1);
        System.out.println(list);


        //Size 

        System.out.println(list.size());

        // Printing array list

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        



    }
    
}
