public class Variable_Argument {
    static int sum(int ...arr){         //function takes arguments....
        int result = 0;
        for(int i:arr){
            result += i;
        }
        return result;
    }

    public static void main(String args[]){
        // System.out.println("hello");
        // System.out.println("Sum of numbers "+sum(3,2));
        // System.out.println("Sum of numbers "+sum(3,2,4,3));
        System.out.println("Sum of numbers "+sum());
    }
    }

 