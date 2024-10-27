
import java.util.Scanner;
public class senaryo {
    public static void main(String[] args)throws java.lang.InterruptedException {
                Scanner scanner = new Scanner(System.in);
                int puan = 0;

                System.out.println("Bilgi Yarışmasına Hoşgeldiniz! Her doğru cevap 10 puan değerindedir.");

                // 1. Soru
                System.out.println("1. Soru: Türkiye'nin başkenti neresidir?");
                System.out.println("A) İstanbul\nB) Ankara\nC) İzmir\nD) Bursa");
                System.out.print("Cevabınız: ");
                String cevap1 = scanner.nextLine().trim().toUpperCase(); // Boşlukları kaldır ve büyük harfe çevir
                if (cevap1.equals("B")) {
                    System.out.println("Tebrikler Cevabınız Doğru!");
                    puan += 10;
                } else {
                    System.out.println("Yanlış! Doğru cevap: B) Ankara");
                }
  Thread.sleep(3000);
                // 2. Soru
                System.out.println("2. Soru: Işık yılı birimi neyi ölçer?");
                System.out.println("A) Zaman\nB) Kütle\nC) Mesafe\nD) Yoğunluk");
                System.out.print("Cevabınız: ");
                String cevap2 = scanner.nextLine().trim().toUpperCase();
                if (cevap2.equals("C")) {
                    System.out.println("Tebrikler Cevabınız Doğru!");
                    puan += 10;
                } else {
                    System.out.println("Yanlış! Doğru cevap: C) Mesafe");
                }
        Thread.sleep(3000);
                // 3. Soru
                System.out.println("3. Soru: Java programlama dilinde kullanılan sınıfın adı hangi kelime ile başlar?");
                System.out.println("A) method\nB) variable\nC) class\nD) public");
                System.out.print("Cevabınız: ");
                String cevap3 = scanner.nextLine().trim().toUpperCase();
                if (cevap3.equals("D")) {
                    System.out.println("Tebrikler Cevabınız Doğru!");
                    puan += 10;
                } else {
                    System.out.println("Yanlış! Doğru cevap: D) public");
                }
        Thread.sleep(3000);
                // Toplam puanı göster
                System.out.println("\nYarışma bitti!");
                System.out.println("Toplam Puanınız: " + puan);

                if (puan == 30) {
                    System.out.println("Tebrikler! Hepsini doğru cevapladınız!");
                } else if (puan >= 10) {
                    System.out.println("Güzel bir performans gösterdiniz.");
                } else {
                    System.out.println("Daha çok çalışmanız gerekiyor.");
                }

                scanner.close();
            }
        }


