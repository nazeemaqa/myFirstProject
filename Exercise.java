public class Exercise {

       String name;
       String difficulty;
       int duration;
         String description;

        public Exercise(String name, String difficulty, int duration, String description) {
            this.name = name;
            this.difficulty = difficulty;
            this.duration = duration;
            this.description = description;
        }

        // Getter methods for Exercise details

        public String getName() {
            return name;
        }

        public String getDifficulty() {
            return difficulty;
        }

        public int getDuration() {
            return duration;
        }

        public String getDescription() {
            return description;
        }
    }














