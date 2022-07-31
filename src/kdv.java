import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {

        double kdv,kdvO,kdvsiz,kdvli;
        boolean kdvDurum;


        Scanner inp=new Scanner(System.in);
        System.out.println("Değer:");
        kdvsiz= inp.nextDouble();


        kdvDurum=(0<kdvsiz)&&(1000>kdvsiz);
        kdvO=kdvDurum?0.18:0.08;


        kdv=kdvO*kdvsiz;
        kdvli=kdv+kdvsiz;

        System.out.println("KDV olmadan:"+kdvsiz);
        System.out.println("KDV değeri:"+kdvO);
        System.out.println("Value added tax amount:"+kdv);
        System.out.println("Price with value added tax:"+kdvli);
    }
}