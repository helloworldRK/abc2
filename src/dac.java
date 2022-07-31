import java.util.Scanner;
public class dac {
    /*Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
    Alan Formülü : pi * r * r;
    Çevre Formülü : 2 * pi * r;
    Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
    𝜋 sayısını = 3.14 alınız.
    Formül : (pi * (r*r) * 𝛼) / 360 */

    public static void main(String[] args) {
        int r, a;
        double pi=3.14, dAlan,cevre,dilAL;
        Scanner inp= new Scanner(System.in);

        System.out.println("Lutfen Yaricap Giriniz: ");
        r=inp.nextInt();

        System.out.println("Lutfen Merkez Açisini Giriniz: ");
        a=inp.nextInt();

        dAlan= pi * r * r;
        cevre= 2 * pi * r;

        //odev
        dilAL= (pi * (r*r) * a) / 360;
        System.out.println("Dairenin Alani: "+dAlan);
        System.out.println("Dairenin cevresi: "+cevre);
        System.out.println("Daire Diliminin Alani: "+dilAL);




    }
}
