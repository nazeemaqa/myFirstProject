public class TimeExercise extends Exercise {
    String  name;
    String discription;
    int timeRemaining;
    int decreasetime;
// constructor

    TimeExercise(String name,String discription, int timeRemaining,int decreasetime) {

    this.durationMinutes = durationMinutes;
    this.discription=discription;
    this.timeRemaining=timeRemaining;
    this.decreasetime=decreasetime;
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
    public String getDiscription() {

        return discription;
    }
        public int gettimeRemaining(){
            return timeRemaining;
        }
        public int getDecreasetime(){
        return decreasetime;


        }
    public void decreaseTime(int seconds) {
        if (seconds > 0) {
            timeRemaining -= seconds;
            if (timeRemaining < 0) {
                timeRemaining = 0;
            }
        }
    }
}




