
interface Animal1 {
    int eyes = 2;
    void walk();
}

interface Harbivor{

}

class Horse1 implements Animal1,Harbivor{
    public void walk(){
        System.out.println("walk on 4 leg");
    }
}




public class Interface {
    public static void main(String args[]){
        Horse1 hs = new Horse1();
        hs.walk();


    }
}
