public class CodExe_Leapyear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1700));
        System.out.println(isLeapYear(1800));
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2100));
        System.out.println(isLeapYear(2200));
        System.out.println(isLeapYear(2300));
        System.out.println(isLeapYear(2500));
        System.out.println(isLeapYear(2600));
        System.out.println();
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2400));
    }
    public static boolean isLeapYear(int year){

        if((year <= 1) || (year >= 9999)){
            return false;
        } else if (year == 365){
            return false;
        } else if (year % 4 == 0) {        //step 1
            if(year % 100 == 0){           //step 2
                if(year % 400 == 0){       //step 3
                    return true;           //step 4
                } else return false;
            } else return true;
        } else return false;                //step 5
    }
}
