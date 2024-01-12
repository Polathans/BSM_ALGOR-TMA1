import java.util.Scanner;
public class ifelse2 {
    public static void main(String[] args) {
        System.out.println("Lütfen notunuzu giriniz");
        Scanner s=new Scanner(System.in);
        int not= s.nextInt();
        if(not>100){
            System.out.println("geçersiz not");
        }
        else if(not>=80){
            System.out.println("AA");
        }
        else if(not>=60){
            System.out.println("BB");
        }
        else if(not>=50){
            System.out.println("CC");
        }
        else{
            System.out.println("FF");
        }
        }
    }

