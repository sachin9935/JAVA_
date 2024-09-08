import java.util.ArrayList;
import java.util.Collections;



public class Short_Array_DecendingOrder {
    public static void main(String args[]){
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(2);
        l2.add(9);
        l2.add(10);
        l2.add(20);
        l2.add(6);

        // Collections.reverse(l2);

        // System.out.println("Ascending order");
        // Collections.sort(l2);

        System.out.println("Decending order:");
        Collections.sort(l2,Collections.reverseOrder());
        System.out.println(l2);

        ArrayList<String> str = new ArrayList<>();
        str.add("zachin");
        str.add("mishra");
        System.out.println("Oeignal list:");
        System.err.println(str);
        

        System.err.println("Sorted");
        Collections.sort(str);
        System.err.println(str);

    }
    
}
