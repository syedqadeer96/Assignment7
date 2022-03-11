package com.company;



class Cycle{
    public void balance(){
        System.out.println("inside cycle's balance");
    }

}
class Unicycle extends Cycle{
    public void balance(){
        System.out.println("inside UNicycle's balance");
    }
}
class Bicycle extends Cycle{
    public void balance(){
        System.out .println("Inside bicycles balance");
    }
}
class Tricycle extends Cycle{

}
public class SeventhB {

    public static void main(String[] args) {
        // write your code here
        // Cycle cycles[]={new Unicycle(),new Bicycle(),new Tricycle()};
        Cycle[]  cycles=new Cycle[3];
        cycles[0]=new Unicycle();
        cycles[0].balance();
        cycles[1]=new Bicycle();
        cycles[1].balance();
        cycles[2]=new Tricycle();
        cycles[2].balance();
        System.out.println("Downcasting");
        ((Unicycle)cycles[0]).balance();
        ((Bicycle)cycles[1]).balance();
        ((Tricycle)cycles[2]).balance();
    }
}
