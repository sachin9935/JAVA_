class DSC{                                        // base class & parent class
    String topic;

    public void area(){
     System.out.println("display area:");
    }
}

//Single claas inheritence...   
class Cloud extends DSC{                           //sub class & child class      
    public void area(int l,int h ){                
        System.out.println(1/2*l*h);

    }
}

// Multi level inharitence
class BIGCLOUD extends Cloud{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}

// Hierarchial level inharitence
class Database extends BIGCLOUD{
    public void area (int r){
        System.out.println((3.14)*r*r);
    }
}



class  inheritance{
    public static void main(String[] args){
        Cloud co = new Cloud();
        co.topic = "saas";


    }
}


// inhartienc 4 typpes

// 1 single level inharitence{
//     Base 
//       |
//       |
//     derived class
// }
// 2 Multi level inharitence{
//      Base 
//        |
//        |
//      derived
//        |
//        |
//      derived}
// 3 Hierarchial level inharitence{
//      Base 
//        |
//        |
//      derived
//        |
//        |
//      derived}
// 4 Hybrid inharitence{
//      Base 
//        |
//        |
//      derived
//        |
//        |
//      derived
//        |
//        |
//      derived}




