import java.util.Arrays;
import java.util.Scanner;

public class ayırmasplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir cumle giriniz :");
        String cumle = sc.nextLine();
        String[] words=cumle.split(" ");
        convertWord(words);
    }
    public static void convertWord(String[] words){
        String[] dizi= new String[words.length];
        String ses= "aeiıouuüAEİIOÖUÜ";
        for (int k=0; k< words.length; k++){
            for (int l = 0; l<words[k].length(); l++){
                for (int r=0; r<ses.length(); r++){
                    if(words[k].charAt(l)==ses.charAt(r)){
                        dizi[k]=words[k].substring(l,words[k].length())+"-"+words[k].substring(0,l)+"ay";
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(dizi));
        for (int u = 0; u<dizi.length; u++) System.out.println(dizi[u]);
    }
    }

