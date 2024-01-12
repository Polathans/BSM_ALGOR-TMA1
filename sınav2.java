import java.util.Arrays;

public class sınav2 {
    public static void main(String[] args) {
        int[]s={1,3,6,7,12};
        System.out.println(aafs(s));
    }
    public static int aafs (int[] a ){
       int min = 0;
       int c=0;
        if(a.length<2){
            return 0;
        }
        int[]dizi = new int[a.length - 1];
        for (int i=1; i<a.length; i++ ) {
            dizi[i-1] = a[i] - a[i-1];

        }
        System.out.println(Arrays.toString(dizi));

        min=dizi[0];
        for (int r=1; r<dizi.length; r++) {
           if(dizi[r-1]<dizi[r]){
               c=dizi[r-1];
               if(c<min){
                   min=c;
               }

           }
           else{
               c=dizi[r];
               if(c<min){
                   min=c;
               }

           }

        }

        return  min;
    }

}
