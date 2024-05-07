public class Method_Overloading_challenge {
    public static void main(String[] args) {
        System.out.println(("inch into centimeters: ") + convertToCentimeters(68));
        System.out.println(convertToCentimeters(5,8));
    }
    public static double convertToCentimeters(int inches){
        return inches * 2.54;
    }
        public static double convertToCentimeters(int heightInFeet, int heightInInches){
        int intoInches = (heightInFeet*12) + heightInInches;
        double intoCentimeters = ((heightInFeet*12) + heightInInches) * 2.54;
        System.out.println( "your height into inches is: " + intoInches);
        System.out.println( "your height into centimeters is: " + intoCentimeters);
        System.out.println( "(passing expression in 1st method directly) your height into centimeters is: " + convertToCentimeters((heightInFeet*12)+heightInInches));
        return convertToCentimeters(heightInInches);

    }
}
