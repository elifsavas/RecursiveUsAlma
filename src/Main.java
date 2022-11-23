import java.util.Scanner;

public class Main {

    static int power(int m, int n) {
    if (n>0)
        return m * power(m,n-1) ;
    else return 1 ;

    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Taban Değeri Giriniz: ");
        int m = input.nextInt();

        System.out.print("Üs Değeri Giriniz: ");
        int n = input.nextInt();

        System.out.print("Sonuç: " + power(m, n));
    }
}
