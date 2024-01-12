import java.util.Scanner;

public class hackerrank1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Bir cümle giriniz: ");
        String a=s.nextLine();
        Palindromik(a);
    }
    public static void Palindromik(String a){
        String b="" ;
        for (int i=a.length()-1; i>=0; i--){
            b=b+a.charAt(i);
        }
        if (b.equals(a)) System.out.println("Palindromiktir");
        else System.out.println("Palindromik değildir");
    }
}
