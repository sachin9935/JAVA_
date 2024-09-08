import java.util.ArrayList;

public class IntegerExample {
    public static void main(String[] args) {
        // Integer i = Integer.valueOf(3);
        // System.out.println(i);
        // Float f = Float.valueOf(4.5f);
        // System.out.println(f);


        //Create a new array list 
        ArrayList<Integer> l1 = new ArrayList<>();
        // ArrayList<Float> l2 = new ArrayList<>();
        // ArrayList<Boolean> l3 = new ArrayList<>();

        //add new elements in array
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        //get an elements at index i
        System.out.println(l1.get(1));

        // print with for loop
        for(int i=0; i<l1.size(); i++){
            System.out.println(l1.get(i));
        }

        //printing arraylist direct
        System.out.println(l1);


        // adding elements at some indix i
        l1.add(1,200);
        System.out.println(l1);

        //Modifing elements at indix i
        l1.set(1, 300);
        System.out.println(l1);

        // removing an element at idx i
        l1.remove(1);
        System.out.println(l1);

        // removing an element e
        l1.remove(Integer.valueOf(7));
        System.out.println(l1);

        // Chacking if an elements exits
        boolean ans = l1.contains(Integer.valueOf(80));
        System.out.println(ans);

        // if you don't specify class, you can put anything inside l
        ArrayList t = new ArrayList();
        t.add("Sachin");
        t.add(1);
        t.add("mishra");
        System.out.println(t);

    }
}
