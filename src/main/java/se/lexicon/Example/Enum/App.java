package se.lexicon.Example.Enum;

public class App {

    public static void main(String[] args) {


        System.out.println(WeekDay.valueOf("monday".toUpperCase()));

        WeekDay[] weekdays = WeekDay.values();

        System.out.println("weekdays[3] = " + weekdays[3]);


        for ( WeekDay day : WeekDay.values()){

            System.out.println(day);
        }

        System.out.println("Array print out with For Loop");
        System.out.println();
        for (int i = 0; i < WeekDay.values().length; i++) {

            System.out.println(WeekDay.values()[i]);
        }


        System.out.println(WeekDay.WEDNESDAY.getStartingHour());

        System.out.println();

        for ( WeekDay day : WeekDay.values()){
            day.printOpenHours();
        }




        System.out.println(Measurement.HECTOGRAM);
        System.out.println(Measurement.HECTOGRAM.getMeasurementValue());
    }

}
