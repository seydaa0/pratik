//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
    Scanner input = new Scanner(System.in);

    System.out.println("Matematik notunuzu giriniz.");
    mat = input.nextInt();

    System.out.println("Fizik notunuzu giriniz.");
    fizik = input.nextInt();

    System.out.println("Kimya notunuzu giriniz.");
    kimya = input.nextInt();

    System.out.println("Türkçe notunuzu giriniz.");
    turkce = input.nextInt();

    System.out.println("Tarih notunuzu giriniz.");
    tarih = input.nextInt();

    System.out.println("Müzik notunuzu giriniz.");
    muzik = input.nextInt();

    int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
    double sonuc = (toplam/6);

    System.out.println("Ortalamanız" + sonuc);

    if(sonuc<60) {
        System.out.println("Sınıfta kaldı.");
    }else if (sonuc>60) {
            System.out.println("Sınıfı geçti.");
        }



        }
    }
