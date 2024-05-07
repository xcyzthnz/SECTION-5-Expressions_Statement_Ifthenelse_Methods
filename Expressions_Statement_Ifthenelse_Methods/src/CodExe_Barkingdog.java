public class CodExe_Barkingdog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if((hourOfDay < 0) || (hourOfDay > 23)){
            return barking = false;
        } else if ((barking == true) && ((hourOfDay >= 0) && (hourOfDay < 8) && (hourOfDay > 22) )){
            return barking = true;
        } else if ((barking == false) || (hourOfDay == 8) || (hourOfDay == 22)) {
            return barking = false;
        }
        return barking;
    }
}
