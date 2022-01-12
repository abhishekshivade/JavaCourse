package inheritance;
/** Note --> Multiple Inheritance Not Supported in Java can be used by another way for java */

/** Single Level Inheritance */
public class Teacher { //parent class, super class, base class
    int id;
    String name;
    String address;

   /* public static void main(String[] args){
        Teacher obj = new Teacher();
        obj.id= 1;
        obj.name= "Abhishek";
        obj.address = "Nashik";

        System.out.println("ID=" + obj.id + " Name=" + obj.name + " Address=" + obj.address);
    }*/
}
/** Single Level Inheritance    */

class ChemistryTeacher extends Teacher { // child class, base class, derived class
    int salary;

    public static void main(String[] args) {
        ChemistryTeacher obj= new ChemistryTeacher();
        obj.id = 2;
        obj.name = "ChemTeacher";
        obj.address = "Pune";

        System.out.println("Id= " + obj.id + " Name= " + obj.name + " Address= " + obj.address);
    }

}
/** Multi Level Inheritance */

class MathTeacher extends ChemistryTeacher { // child class, base class, derived class
    int salary;

    public static void main(String[] args) {
        MathTeacher obj= new MathTeacher();
        obj.id = 3;
        obj.name = "MathTeacher";
        obj.address = "Mumbai";

        System.out.println("Id= " + obj.id + " Name= " + obj.name + " Address= " + obj.address);
    }

}
/** Herarchical inheritance */
class PhysicsTeacher extends Teacher { // child class, base class, derived class
    int salary;

    public static void main(String[] args) {
        PhysicsTeacher obj = new PhysicsTeacher();
        obj.id = 4;
        obj.name = "Physics";
        obj.address = "Nahik";

        System.out.println("Id= " + obj.id + " Name= " + obj.name + " Address= " + obj.address);
    }
}

/** Hybrid inheritance  */
class SocialTeacher extends ChemistryTeacher { // child class, base class, derived class
    int salary;

    public static void main(String[] args) {
        SocialTeacher obj = new SocialTeacher();
        obj.id = 4;
        obj.name = "Social";
        obj.address = "India";

        System.out.println("Id= " + obj.id + " Name= " + obj.name + " Address= " + obj.address);
    }
}

