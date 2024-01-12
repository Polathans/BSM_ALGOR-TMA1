import java.util.Scanner;

public class alfabedöngü {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("sifreyi girin");
        String pass = a.nextLine();

        System.out.println(validPassword(pass));

    }

    public static boolean validPassword(String pass) {
        int sayac = 0;
        if (pass.length() < 10) {
            return false;
        }

        for (int i = 0; i < pass.length(); i++) {
            for (int j = 0; j <= 9; j++) {
                if (Character.getNumericValue(pass.charAt(i))==j) {
                    sayac++;
            }
            }
        }
        int sayac1 = 0;
        for (int a = 0; a < pass.length(); a++) {

            for (char q = 'a'; q < 'z'; q++) {
                if (pass.charAt(a) == q) {
                    sayac1++;
                }
            }

        }

        if (sayac < 3) {
            return false;
        }
        if ((sayac + sayac1) != pass.length()) {
            return false;
        } else {
            return true;
        }

    }

}