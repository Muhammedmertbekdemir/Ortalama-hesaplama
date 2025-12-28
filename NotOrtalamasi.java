import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ilk önce değişkenleri tespit ediyoruz. (quiz final vize notu lazım)
        // hesaplamaları yap.
        // koşullara bak.
        // sonucu ekrana yazdır.
        int quiz, ffinal, vize ;
        double ortalama ;
        Scanner input = new Scanner(System.in);
        System.out.println("quiz notunu giriniz");
        quiz = input  .nextInt() ;
        System.out.println("ffinal notunu giriniz");
        ffinal = input  .nextInt() ;
        if (ffinal < 50) {
            System.out.println("sınıfta kaldınız");
        } else {
            System.out.println("vize notunu giriniz");
        }
        vize = input  .nextInt() ;

        ortalama = ((vize + ffinal +quiz) / 3) ;
        System.out.println("ortalama : "+ortalama);



    }
}
