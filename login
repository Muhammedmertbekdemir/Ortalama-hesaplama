import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Scanner sınıfını import etmemiz lazım
        String kullaniciadi,parola;
        System.out.println("Kullanıcı adını giriniz:");
        kullaniciadi = scan.nextLine();
        System.out.println("Parola girniz :");
        parola = scan.nextLine();
        if (kullaniciadi.equals("mert") && parola.equals("123")) {  // ve bağlacı kullanarak mert ve 123 olmasını sağladık.
            System.out.println("Başarılı giriş");
        }else {
            System.out.println("Kullanıcı adı veya parola yanlış");
        }


    }
}
