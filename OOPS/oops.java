class pen{  //blue print & "properityes"
    String color;
    String type; 

    // function which defin in clss is called "mathods"
    public void write(){
        System.out.println("write somthing:");
    }
    public void printColor(){
        System.out.println(this.color);
        System.out.println(this.type);
    }
}




class Student{
    String name;
    int age;
    char grade;

    public void studentInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.grade);
    }

//  Constructor = Student()


    // Student() {                                          // NON paramiterize Constructor
    //     System.out.println("Constructor called:");
    // }

    // Student(String name,int age,char grade) {                 // Paramiterize Constructor
    //     this.name = name;
    //     this.age = age;
    //     this.grade = grade;
    // }

    Student(Student sd2){                                 //copy Constructor
        this.name = sd2.name;
        this.age = sd2.age;
        this.grade = sd2.grade;
    }

    Student(){
        
    }
}










class oops {
    public static void main(String[] args){  

//data&members

    // pen Pen1 = new pen();
    // Pen1.color = "blue";                   
    // Pen1.type = "ballPen";

    // pen Pen2 = new pen();
    // Pen2.color = "Red";
    // Pen2.type = "gel";

    // Pen1.printColor();
    // Pen2.printColor();

    // Pen1.write();

    Student sd = new Student();                      //  Constructor = Student()
    // Student sd = new Student("sachin",20,'A');       // Parameterize constrector

    sd.name = "Sachin";
    sd.age = 20;
    sd.grade = 'S';

    Student sd2 = new Student(sd);                 //copy one data to another function
    sd2.studentInfo();











    }

}