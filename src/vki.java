import java.util.Scanner;

public class vki {
    public static void main(String[] args) {
       //Kilo (kg) / Boy(m) * Boy(m)
        double m,vki;
        int kg;
        Scanner inp= new Scanner(System.in);

        System.out.println("Lütfen boyunuzu metre cinsinden giriniz: ");
        m= inp.nextFloat();

        System.out.println("Lütfen kilonuzu kilogram cinsinden giriniz: ");
        kg= inp.nextInt();

        vki=  (kg) / (m) * (m);
        System.out.println("Vucut kitle indeksiniz: "+ vki);

    }
}
