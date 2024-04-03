import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //unos prvog broja
        System.out.println("Unesite prvi broj:");
        Scanner prviSkener = new Scanner(System.in);
        int prviBroj = prviSkener.nextInt();

        //unos drugog broja
        System.out.println("Unesite drugi broj:");
        Scanner drugiSkener = new Scanner(System.in);
        int drugiBroj = drugiSkener.nextInt();

        //unos treceg broja
        System.out.println("Unesite treci broj:");
        Scanner treciSkener = new Scanner(System.in);
        int treciBroj = treciSkener.nextInt();

        //mnozenje tri broja i uporedjivanje da li je proizvod veci ili manji od nule
        int proizvod = prviBroj * drugiBroj * treciBroj;

        if (proizvod > 0){
            System.out.println("Rejzovic Emir");
        }
    }
}