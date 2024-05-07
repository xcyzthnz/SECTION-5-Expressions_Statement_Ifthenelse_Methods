public class CodExe_EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,-1,0));
    }

    public static boolean hasEqualSum(int num1, int num2, int num3){
        int sumOfnum1num2 = num1 + num2;

        if (sumOfnum1num2 == num3){
        return true;
        }else{return false;}
    }
}
