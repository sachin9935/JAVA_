class Collage_data{
    String name;
    char grade;
    int number;

    

    public void information(String name){
        System.out.println(name);
    }

    public void information(int number){
        System.out.println(number);
    }

    public void information(String name,int number,char grade){
        System.out.println(name);
        System.out.println(number);
        System.out.println(grade);
    }


}

class Polymorphism{
    public static void main(String[] args){
        Collage_data cd1 = new Collage_data();
        cd1.name = "BBD";
        cd1.number = 99351094;
        cd1.grade = 'S';

        cd1.information(cd1.name,cd1.number,cd1.grade);
        cd1.information(cd1.number);
        
    }
}