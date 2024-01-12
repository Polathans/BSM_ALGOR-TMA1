import java.util.Arrays;
import java.util.Random;

public class random100 {
    public static void main(String[] args) {
        int[] list1=new int[10] ;
        for (int i=0; i<=9; i++) {
            Random rastgele = new Random();
            int a = rastgele.nextInt(100);
            list1[i]=a;
        }
        Siralama(list1);

    }
    public static void Siralama(int[]list1){
        int gecici ;
        for(int i = 0; i < 9; i++)
        {
            for(int j = i+1; j < 10; j++)
            {
                if(list1[j] < list1[i]) {
                    gecici = list1[i];
                    list1[i] = list1[j];
                    list1[j] = gecici;
                }
            }
        }
        for(int i = 0; i < 10; i++)
        {

        } System.out.println(Arrays.toString(list1));
    }
}

