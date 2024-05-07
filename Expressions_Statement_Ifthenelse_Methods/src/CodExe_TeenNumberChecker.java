public class CodExe_TeenNumberChecker {
    public static void main(String[] args) {
        //boolean hasTeenResult = hasTeen(9, 99, 19);
        //boolean hasTeenResult = hasTeen(25, 15, 42);
        boolean hasTeenResult = hasTeen(22, 23, 43);
        System.out.println(hasTeenResult);

        boolean isTeenResult = isTeen(13);
        System.out.println(isTeenResult);
    }

    public static boolean hasTeen(int person1, int person2, int person3) {
        return (person1 >= 13 && person1 <= 19) || (person2 >= 13 && person2 <= 19) || (person3 >= 13 && person3 <= 19);
    }

    public static boolean isTeen(int teenAge) {
        return (teenAge >= 13 && teenAge <= 19);
    }
}
