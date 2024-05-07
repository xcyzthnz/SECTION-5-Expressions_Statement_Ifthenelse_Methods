public class SecondsandMinutes_Challenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(-3945)); //1st
        System.out.println(getDurationString(-60, 45)); //2nd
        System.out.println(getDurationString(65, 145));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));

    }
    public static String getDurationString(int seconds){

        if(seconds < 0){
            return "error non positive integer " + seconds;}

        int minutes = seconds / 60;
        return getDurationString(seconds / 60,seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds){

        if(minutes < 0){
            return "error non positive integer" + minutes;}
        if((minutes <= 0) || (seconds >= 59)){
            return "error must be 0-59 \n";}

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }
}
