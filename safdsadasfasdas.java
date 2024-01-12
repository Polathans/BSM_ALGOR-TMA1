import java.util.Scanner;
public class safdsadasfasdas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("bir söz dizisi giriniz: ");
        String a=sc.nextLine();

        System.out.println(countLetters(a));
    }
    public static int countLetters(String s) {
        int sayac = 0;
        int harfsayisi;
        for (int i = 0; i <= s.length() - 1; i++) {
            if (s.charAt(i)==' ') {
                sayac++;
            }
        }
        harfsayisi = s.length() - sayac;
        return harfsayisi;
    }
}
