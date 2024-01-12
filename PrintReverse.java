import java.util.Scanner;

public class PrintReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir cümle giriniz:");
        String a= sc.nextLine();
        String b="";
        for (int i=a.length()-1; i>=0; i--){
            /*for (int j=0; j<a.length(); j++){

            }*/
            b=b+a.charAt(i);
        }
        System.out.println(b);
    }
}
