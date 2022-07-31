import java.util.Scanner;
public class manav {
    public static void main(String[] args) {
        /*Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL*/
        double armut=2.14, elma=3.67, dom=1.11, muz=0.95, pat=5.00;
        double aF, eF, dF,mF, pF,total;
        Scanner input= new Scanner(System.in);
        System.out.println("Armut kac kilo: " );
        aF=input.nextFloat();

        System.out.println("Elma kac kilo: " );
        eF=input.nextFloat();

        System.out.println("Domates kac kilo: " );
        dF=input.nextFloat();

        System.out.println("Muz kac kilo: " );
        mF=input.nextFloat();

        System.out.println("Patetes kac kilo: " );
        pF=input.nextFloat();

        total= (armut*aF) + (elma*eF) + (dom* dF)+ (muz*mF)+ (pat* pF);
        System.out.println("Toplam Tutar: "+total);



    }
}
