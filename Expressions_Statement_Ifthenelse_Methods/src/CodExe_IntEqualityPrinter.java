public class CodExe_IntEqualityPrinter {
    public static void main(String[] args) {
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
    }

    public static void printEqual(int num1, int num2, int num3) {
        if (num1 < 0 || num2 < 0 || num3 < 0) {
            System.out.println("Invalid Value");
        } else if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");
        } else if (num1 != num2 && num2 != num3 && num1 != num3) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}


//        if (no1 < 0 || no2 < 0 || no3 < 0) {
//        System.out.println("Invalid Value");
//        } else if ((no1 == no2 && no1 == no3) && (no2 == no1 && no2 == no3) && (no3 == no1 && no3 == no2)) {
//        System.out.println("All numbers are equal");
//        } else if ((no1 == no2 || no1 != no3) || (no2 != no1 || no2 != no3) || (no3 != no1 || no3 != no2)) {
//        System.out.println("Neither all are equal or different");
//        } else if ((no1 < no2 || no1 < no3) || (no2 < no1 || no2 < no3) || (no3 < no1 || no3 < no2)) {
//        System.out.println("All numbers are different");
//        } else if ((no1 > no2 || no1 > no3) || (no2 > no1 || no2 > no3) || (no3 > no1 || no3 > no2)) {
//        System.out.println("All numbers are different");
//        }