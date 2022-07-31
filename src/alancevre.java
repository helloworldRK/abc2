import java.util.Scanner;
public class alancevre{
    public static void main(String[] args) {
        int a,b,c;
        double al,cevre,u,alk;
        Scanner input=new Scanner(System.in);

        System.out.println("Birinci Kenar uzunlugu:");
        a=input.nextInt();
        System.out.println("ikinci Kenar uzunlugu:");
        b=input.nextInt();
        System.out.println("Ucuncu Kenar uzunlugu:");
        c=input.nextInt();

        cevre=(a+b+c)/2;
        u=cevre*2;
        alk= (u-a)*(u-b)*(u-c);
        al=Math.sqrt(alk);
        System.out.println("Ucgeninizin cevresi:"+cevre);
        System.out.println("Ucgeninizin alanı:"+al);



    }
}