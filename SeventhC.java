package com.company;
interface InterOne{
    public void fmeth1();
    public void fmeth2();
}
interface InterSecond{
    public void smeth1();
    public void smeth2();
}
interface InterThird{
    public void tmeth1();
    public void tmeth2();
}
interface InterImplementing extends InterOne,InterSecond,InterThird{
    public void extendMeth();
}
class Concrete {
    public void conMethod(){
        System.out.println("Concrete class method");
    }
}
class Implementing extends Concrete implements  InterImplementing {
    //override
    public void fmeth1(){
        System.out.println("Method 1 of First Interface");
    }
    public void fmeth2(){
        System.out.println("Method 2 of First Interface");
    }
    public void smeth1(){
        System.out.println("Method 1 of second Interface");
    }
    public void smeth2(){
        System.out.println("Method 2 of second Interface");
    }
    public void tmeth1(){
        System.out.println("Method 1 of Third Interface");
    }
    public void tmeth2(){
        System.out.println("Method 2 of Third Interface");
    }
    public void extendMeth(){
        System.out.println("Method of Extending Interface");

    }
    public void a(InterOne  one){
        one.fmeth1();
        one.fmeth2();

    }
    public void b(InterSecond  sec){
        sec.smeth1();
        sec.smeth2();

    }
    public void c(InterThird  third){
        third.tmeth1();
        third.tmeth2();

    }
    public void d( InterImplementing  one){
        one. extendMeth();

    }
}

public class SeventhC{
    public static void main(String args[]){
        Implementing iObj=new Implementing();
        iObj.a(iObj);
        iObj.b(iObj);
        iObj.c(iObj);
        iObj.d(iObj);

    }
}
