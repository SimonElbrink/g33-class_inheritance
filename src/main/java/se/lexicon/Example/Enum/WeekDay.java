package se.lexicon.Example.Enum;

public enum WeekDay {

    MONDAY(12,14),
    TUESDAY(8,16),
    WEDNESDAY(9,16),
    THURSDAY(8, 20),
    FRIDAY(6,12),
    SATURDAY(0,0){
        @Override
        public void printOpenHours(){
            System.out.println(toString() +": We are Closed");
        }
    },
    SUNDAY(0,0){
        @Override
        public void printOpenHours(){
            System.out.println(toString() +": We are Closed");
        }
    };

    private final int startingHour;
    private final int closingHour;

    WeekDay(int startingHour, int closingHour) {
        this.startingHour = startingHour;
        this.closingHour = closingHour;
    }

/*
        public void setStartingHour(Double value){
        startingHour = value;
        }
    */

    public int getStartingHour() {
        return startingHour;
    }

    public int getClosingHour() {
        return closingHour;
    }

    public void printOpenHours(){
        System.out.println( toString() + ": Open Hours: "+ startingHour + " - " + closingHour);
    }
}
