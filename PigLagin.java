import java.util.Arrays;
import java.util.Scanner;

public class PigLagin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir cumle giriniz :");
        String cumle = sc.nextLine();
        cumle=cumle+' ';
        int sayac=0;
        int bosluk=0;
        for (int i=0; i<cumle.length(); i++ ){
            if(cumle.charAt(i)==' ') sayac++;
        }
        String[] words=new String[sayac+1];
        for (int j=0; j< words.length; j++){
            for (int p=0; p<cumle.length(); p++ ){
            if(cumle.charAt(p)==' '){
                words[j]= cumle.substring(bosluk,p);
                bosluk=p+2;
            }
        }
        }
        System.out.println(Arrays.toString(words));
        convertWord(words);
    }
    public static void convertWord(String[] words){
        String ses= "aeiıouuüAEİIOÖUÜ";
        for (int k=0; k< words.length; k++){
            for (int l = 0; l<words[k].length(); l++){
                for (int r=0; r<ses.length(); r++){
                    if(words[k].charAt(l)==ses.charAt(r)){
                        words[k]=words[k].substring(l)+"-ay"+words[k].substring(l,words[k].length()-1);
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(words));
    }
}
