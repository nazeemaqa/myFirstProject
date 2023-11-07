package comn.iris.polymorphism;

public interface Player1 {
    // attributes -- by default final - means no body can change its value.
    public final int id=10;
    // by default abstract method
    int move();
    public class player2  implements Player1{

        @Override
        public int move() {
            return 2000;
        }
       public static void main (String args[]){
            player2 p=new player2();
            System.out.println(p.move());
           System.out.println(id);
       }




    }




}
