import java.util.Scanner ;
public class ifelseif {
    public static void main(String[] args) {
        System.out.println("Lütfen sayı girniz:");
        Scanner s = new Scanner(System.in);
        int i=s.nextInt();
        if (i == 10) {
            System.out.println("i nin değeri 10 dur");
        } else {
            System.out.println("i nin değeri 10 değildir");
        }
    }

}
