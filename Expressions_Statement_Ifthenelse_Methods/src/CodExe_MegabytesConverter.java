public class CodExe_MegabytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1000);
        printMegaBytesAndKiloBytes(0);
    }
    public static void printMegaBytesAndKiloBytes (int kiloBytes){

        if(kiloBytes < 0){
            System.out.println("Invalid Value");

        } else if (kiloBytes > 0) {
            int megaByte = kiloBytes / 1024;
            int remainingKiloByte = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaByte + " MB" + " and " + remainingKiloByte + " KB" );
        } else if (kiloBytes == 0) {
            int megaByte = kiloBytes / 1024;
            int remainingKiloByte = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaByte + " MB" + " and " + remainingKiloByte + " KB" );
        }
    }
}
