import java.util.Arrays;
import java.util.Scanner;

public class tekcift {
    public static void main(String[] args) {
        int[] list= new int[5];
        System.out.println("sayı girin");
        for (int i=0; i<5; i++){
            Scanner sc= new Scanner(System.in);
            list[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(list));
        for (int j=0; j<5; j++){
            if(list[j]%2==0){
                System.out.println(list[j] +"=çifttir");
                }
            else System.out.println(list[j] +"=tektir");
            }
        }
    }

