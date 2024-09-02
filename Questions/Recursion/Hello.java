package Recursion;

public class Hello {
    public static void main(String args[]){
        message();
    }

    public static void message(){
        System.out.println("hello");
        message1();
    }
    public static void message1(){
        System.out.println("hello");
        message2();
    }
    public static void message2(){
        System.out.println("hello");
        message3();
    }
    public static void message3(){
        System.out.println("hello");
//        message1();
    }
}
