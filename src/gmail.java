import java.util.Scanner;
public class gmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Email adresinizi giriniz:");
        String email = scanner.nextLine();

        if (isGoogleEmail(email)) {
            System.out.println("Geçerli Google domainli bir email adresi girdiniz: true");
        } else {
            System.out.println("Geçersiz email adresi girdiniz: false");
        }

        scanner.close();
    }

    public static boolean isGoogleEmail(String email) {
        return email.endsWith("@gmail.com");
    }
}

