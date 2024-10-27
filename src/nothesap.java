import java.util.Scanner;

public class nothesap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vize notunuzu giriniz:");
        double Vize = scanner.nextInt();
        System.out.println("Final notunuzu giriniz:");
        double Final = scanner.nextInt();
        double vize = (Vize*35)/100;
        double finalnot = (Final*65)/100;
        double ort = vize+finalnot ;
        if(ort>75){
            System.out.println("GEÇTİN");
        }else{
            System.out.println("KALDIN");
        }

    }
}
