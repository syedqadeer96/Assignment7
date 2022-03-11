package com.company;






abstract class Rodent {
    Rodent(){
        System.out.println("Rodents default Constructor");
    }
    abstract void eat();

    abstract void running();
}

class Mouse extends Rodent{
    Mouse(){
        System.out.println("Mouse Class Constructor");
    }
    void eat(){
        System.out.println("Mouse is eating");
    }
    void running(){
        System.out.println("Mouse is running");
    }
}

class Gerbil extends Rodent{
    Gerbil(){
        System.out.println("Gerbil Class Constructor");
    }
    void eat(){
        System.out.println("Gerbil is eating");
    }
    void running(){
        System.out.println("Gerbil  is running");
    }
}
class Hamster extends Rodent{
    Hamster(){
        System.out.println("Hamster Class Constructor");
    }
    void eat(){
        System.out.println("Hamster is eating");
    }
    void running(){
        System.out.println("Hamster is running");
    }
}
public class Main {

    public static void main(String[] args) {
        // write your code here
        Rodent[] r=new Rodent[3];
        r[0]=new Mouse();
        //  r[1]=new Gerbil();
        //  r[2]=new Hamster();
        r[0].eat();
        r[0].running();
        r[1]=new Gerbil();
        r[1].eat();
        r[1].running();
        r[2]=new Hamster();
        r[2].eat();
        r[2].running();
    }
}
