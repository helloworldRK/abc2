import java.util.Scanner;
public class hipotenus {
    public static void main(String[] args) {


        int a, b,cevre;
        double c,u ;
        Scanner inp = new Scanner(System.in);
        System.out.println("1.kenar");
        a = inp.nextInt();
        System.out.println("2.kenar");
        b = inp.nextInt();
        c = Math.sqrt((a * a) + (b * b));
        System.out.println("Hipotenus:"+c);




    }
}