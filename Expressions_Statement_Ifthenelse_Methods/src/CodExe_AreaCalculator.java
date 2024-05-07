public class CodExe_AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(5.0,4.0));
    }

    public static double area(double radius){
        if(radius < 0){
            return -1;
        }else return Math.PI * radius * radius;
    }

    public static double area(double x, double y){
        if(x < 0 || y < 0){
            return -1;
        }else return x * y;
    }
}
