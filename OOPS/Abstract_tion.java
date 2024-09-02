
abstract class Animal{
    abstract void walk();
    public void eats(){
        System.out.println("you can eat");
    }
}

class Houres extends Animal{
    public void walk(){
        System.out.println("wallks on 4 legs");
    }
}

class Chiken extends Animal{
    public void walk(){
        System.out.println("wallks on 2 legs");
    }
}

public class Abstract_tion {
    public static void main(String args[]){
        Houres Hs = new Houres();
        Hs.walk();
        Hs.eats();
        



       // System.out.println("hello");
    }

}
