
class bus{
    String name;
    int price;
    char Standared;

    public void info(){
        System.out.println("Write something...");
        System.out.println(this.name);
        System.out.println(this.price);
        System.out.println(this.Standared);
        
        
        
    }

   

    // public void printinfo(){
    //     System.out.println(this.name);
    // }
}


class code{
    String name;
    int age;

    public void pCode(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    
    // code(){                                                       //NON--Parameterize Constructor..
    
    // code(String name,int age){                                      // Parameterize Constructor....

    code(code cd2){                                                    // Copy Constructor....
        this.name = cd2.name;
        this.age = cd2.age;
        // System.out.println("constructor called:!");
    }
    code(){

    }

}

class practic{
    public static void main(String[] args){
        // bus mdl1 = new bus();
        // bus mdl2 = new bus();
        // mdl1.name = "tata moters";
        // mdl1.price = 100;
        // mdl2.name = "Maruti car";

        // //Call mathod & functions
        // mdl1.info();  
        // mdl2.info();  

        // // mdl1.printinfo();

        code cd = new code();             //
        cd.name = "sachin mishra";
        cd.age = 20;

        code cd2 = new code(cd);         //assing one prperity to another....
        cd2.pCode();

        // cd.pCode();



    }
}