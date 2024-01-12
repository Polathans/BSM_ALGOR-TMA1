import java.util.Scanner;

public class büt2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Bir sayı giriniz :");
        int num=sc.nextInt();
        System.out.println(digitRange(num));
    }
    public static int digitRange(int num) {
        num = Math.abs(num);
        int max = num % 10;
        int min = num % 10;
        num /= 10;

        while(num > 0) {
            int digit = num % 10;

            if(digit > max) {
                max = digit;
            } else if(digit < min) {
                min = digit;
            }

            num /= 10;
        }

        return max - min + 1;
    }

}

