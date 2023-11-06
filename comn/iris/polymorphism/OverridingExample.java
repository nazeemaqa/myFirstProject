package comn.iris.polymorphism;
class parent{
    void display(){
        System.out.println("parent class method ");
    }
}
class child extends parent{
   // @Override //annotation
    void display(){
        System.out.println("child class method");
    }
}
class child2 extends parent{
    void display(){
        System.out.println("child2 class method");

    }
}
 public class OverridingExample {

public static void main (String args[]){
    parent p;
    // create object for child class using parent class
    p= new child();
    p.display();
    p=new child2();
    p.display();


}







}
