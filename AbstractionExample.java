




    abstract class Mark{
        // atleast one abstract method
        public abstract void display(int marks);
    }

class child extends Mark{
    public void display(int marks) {
        System.out.println(marks +  " is displayed");

    }}
public class AbstractionExample {

public static void main (String argsn[]){
    child c=new child();
    c.display(45);
}




}
