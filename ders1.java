import java.sql.SQLOutput;

import static java.lang.System.*;

public class ders1 {
    public static void main(String[] args) {
        for (int i=0; i<=10 ; i++) {
            System.out.println("mseaj" + i);
        }
        int i = 0;
        while (i <= 10) {
            System.out.println("Mesaj" + i);
            i++;
        }
        i=0;
        do{
            System.out.println("ikinci mesaj"+i);
            i++;
        }while (i<=10);
    }
}
