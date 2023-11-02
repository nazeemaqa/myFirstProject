public class ExcerciseClass {
    // attributies
   String  name;
   int difficultylevel;
   int durationMinutes;
   String discription;

// contructor
   ExcerciseClass (String  name, int difficultylevel,  int durationMinutes, String discription){
       this.name = name;
       this.difficultylevel =difficultylevel;
       this.durationMinutes = durationMinutes;
       this.discription=discription;
   }




// getters

 public String getName(){
       return name;
 }
 public int getDifficultyLevel(){
       return difficultylevel;
 }
 public int getDurationMinutes(){
       return durationMinutes;

 }
 public String getDiscription(){

       return discription;
    }






}
