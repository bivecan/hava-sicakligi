import java.util.Scanner;

public class HavaSicakligi {
    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);

        System.out.println("Sıcaklıgı giriniz: ");
        int derece = girdi.nextInt();

        if (derece >25) {
            System.out.println("Yüzebilirsiniz");
        }

        else if(derece >=5) {
            if (derece <= 15) {
                System.out.println("Sinemaya gidebilirsin");
            }
            if (derece >= 10) {
                System.out.println("Piknige gidebilirsin");
            }

        }

        else {
            System.out.println("Kayabilirsin");
              }
    }
}
