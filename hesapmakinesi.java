import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi1,sayi2;
        System.out.println("ilk sayıyı giriniz");
        sayi1 = scan.nextInt();
        System.out.println("ikinci sayıyı giriniz");
        sayi2 = scan.nextInt();
        System.out.println("lütfen yapmak istediğiniz işlemi seçiniz");
        System.out.println("1 - Toplama \n2 - Çıkarma \n3 - Çarpma \n4 - Bölme");
        System.out.println("seçiminiz:");
        int secim = scan.nextInt();

        if (secim == 1) {
            System.out.println("Toplama :"+ (sayi1 + sayi2));
        }else if (secim == 2) {
            System.out.println("Çıkarma :" + (sayi1 - sayi2));
        }else if (secim == 3) {
            System.out.println("Çarpma :" + (sayi1 * sayi2));
        }else if (secim == 4) {
            System.out.println("Bölme :" + (sayi1 / sayi2));
        }


    }
}
