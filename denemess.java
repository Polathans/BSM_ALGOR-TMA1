import java.util.Scanner;

public class denemess {
    public static void main(String[] args) {
        System.out.println("Vize notunu giriniz :");
        Scanner r = new Scanner(System.in);
        int vize = r.nextInt();
        System.out.println("Final notunu giriniz :");
        Scanner p = new Scanner(System.in);
        int fınal = p.nextInt();
        int ortalama = (fınal*60/100+vize*40/100);
        System.out.println("ortalamanız " + ortalama);
        if (ortalama >= 80) {
            System.out.println("AA");
        }
        else if(ortalama>=60) {
            System.out.println("BB");
        }
        else if(ortalama>=50){
            System.out.println("CC");
        }
        else{
            System.out.println("FF");
        }

    }

}