package com.company;



class FirstOuter{
    //String ;
    private int z=10;
    class FirstInner{
        //private String name;
        FirstInner(String n){
            //    name=n;
            System.out.println("First Inner class name:::"+n+""+z);
        }

    }
}

class SecondOuter extends FirstOuter{

    String i;
    class SecondInner extends FirstInner {
        public  SecondInner(String initial){
            //With super  we are able to access the immediate parent class CONSTRUCTOR
            super(initial);
            //super.z=10;
            //i= initial;
            System.out.println("Second Inner class name:::"+initial);
        }
        //  private String name;
        // public void display() {
        //   System.out.println("Inner class print sttement"+(super.name));
    }
}

public class SeventhE{

    public static void main(String[] args) {
        // write your code here
        FirstOuter fOuterObject=new FirstOuter();
        FirstOuter.FirstInner fInnerObject=fOuterObject.new FirstInner("Syed");

        SecondOuter sOuterObject=new  SecondOuter();
        SecondOuter.SecondInner  sInnerObject= sOuterObject.new SecondInner("Abdul");
        //  sInnerObject.display();
    }
}


/*class FirstOuterClass {
    class FirstInnerClass{
        public FirstInnerClass(){
            System.out.println("First Inner Class Variable : ");
        }

    }
}
class SecondOuterClass extends FirstOuterClass{
    class SecondInnerClass extends FirstInnerClass{

        public SecondInnerClass() {
            super();
           System.out.println("Second Inner Class  Variable: ");
        }
    }
}

public class Main {

    public static void main(String[] args) {
        // write your code here
        FirstOuterClass firstOuterClass = new FirstOuterClass();
        //creating first inner class object using instance of outer class
        FirstOuterClass.FirstInnerClass firstInnerClass = firstOuterClass.new FirstInnerClass();
        SecondOuterClass secondOuterClass = new SecondOuterClass();
        SecondOuterClass.SecondInnerClass secondInnerClass = secondOuterClass.new SecondInnerClass();
    }
}*/
