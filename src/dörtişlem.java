import java.util.ArrayList;
import java.util.Scanner;

public class dörtişlem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("İşlem türünü seçin (+, -, *, /) veya 'escape' yazarak çıkın:");
            String islem = scanner.nextLine();

            if (islem.equalsIgnoreCase("escape")) {
                System.out.println("Program sonlandırılıyor...");
                break;
            }

            ArrayList<Double> sayilar = new ArrayList<>();
            System.out.println("İşlem için sayı girin (bittiğinde 'escape' yazın):");

            while (true) {
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("escape")) {
                    break;
                }
                try {
                    double sayi = Double.parseDouble(input);
                    sayilar.add(sayi);
                } catch (NumberFormatException e) {
                    System.out.println("Geçersiz sayı, lütfen tekrar deneyin.");
                }
            }

            if (sayilar.size() < 2) {
                System.out.println("İşlem yapmak için en az 2 sayı girmelisiniz.");
                continue;
            }

            double sonuc = sayilar.get(0);
            for (int i = 1; i < sayilar.size(); i++) {
                switch (islem) {
                    case "+":
                        sonuc += sayilar.get(i);
                        break;
                    case "-":
                        sonuc -= sayilar.get(i);
                        break;
                    case "*":
                        sonuc *= sayilar.get(i);
                        break;
                    case "/":
                        if (sayilar.get(i) != 0) {
                            sonuc /= sayilar.get(i);
                        } else {
                            System.out.println("Bir sayıyı 0'a bölemezsiniz.");
                            sonuc = Double.NaN;
                            break;
                        }
                        break;
                    default:
                        System.out.println("Geçersiz işlem türü.");
                        sonuc = Double.NaN;
                        break;
                }
                if (Double.isNaN(sonuc)) break;
            }

            if (!Double.isNaN(sonuc)) {
                System.out.println("Sonuç: " + sonuc);
            }
        }

        scanner.close();
    }
}