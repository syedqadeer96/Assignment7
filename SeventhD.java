package com.company;

import java.util.ArrayList;
interface Cycle{
    public void specifications();
}
class Unicycle implements Cycle{
    public void specifications(){
        System.out.println("Runs on Single wheel");
    }
}
class Bicycle implements Cycle{
    public void specifications(){
        System.out.println("Runs on Two wheels");
    }
}
class Tricycle implements Cycle{
    public void specifications(){
        System.out.println("Runs on three wheels");
    }
}
abstract class Factory{
    public abstract Cycle instance();
}
class UnicycleFactory extends Factory{
    public  Cycle instance(){
        return new Unicycle();
    }
}
class BicycleFactory extends Factory{
    public  Cycle instance(){
        return new Bicycle();
    }
}
class TricycleFactory extends Factory{
    public  Cycle instance(){
        return new Tricycle();
    }
}
public class SeventhD{
    public static void main(String args[]) {
        ArrayList<Cycle> al=new ArrayList<>();
        //Adding different types of factories and creating its instatnces
        al.add(new UnicycleFactory().instance());
        al.add(new BicycleFactory().instance());
        al.add(new  TricycleFactory().instance());
        //Printing the methods using all the instances/objects in the list
        for(Cycle c:al){
            c.specifications();
        }
    }
}