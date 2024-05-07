public class CodeExe_DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }
    public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo) {
        // Multiply the numbers by 1000 to shift the decimal point three places to the right
        int multipliedNumberOne = (int) (numberOne * 1000);
        int multipliedNumberTwo = (int) (numberTwo * 1000);
        // Compare the integer representations of the multiplied numbers
        if (multipliedNumberOne == multipliedNumberTwo) {
            return true;
        } else {
            return false;
        }
    }
}

