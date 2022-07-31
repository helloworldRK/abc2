import java.util.Scanner;
public class taks {
    public static void main(String []args ){
        int km;
        double perKm=2.20, total=10;
        Scanner inp= new Scanner(System.in);
        System.out.println("Gidilen mesafeyi KM cinsinden Giriniz: ");
        km=inp.nextInt();
        total+=(km+perKm);
        total=(total<20)? 20:total;
        System.out.println("Toplam Tutar: "+total);
    }
}
