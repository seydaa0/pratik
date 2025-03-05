//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float siz, li, tutar;
    Scanner input = new Scanner(System.in);

    System.out.println("KDV'siz tutarı giriniz.");
    siz = input.nextFloat();
    if(siz>1000) {
        System.out.println("KDV'li fiyat:" + (((siz * 8) / 100)+ siz));
        System.out.print("KDV tutarı:8");

    }else if(siz<1000){
        System.out.println("KDV'li fiyat:" + (((siz * 18)/100)+ siz));
        System.out.print("KDV tutarı:1.8");
    }








        }
    }
