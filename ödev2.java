public class ödev2 {
    public static void main(String[] args) {
        int[] dizi = {6,2,9,11,3};

        System.out.println(percentEven(dizi));




    }
    public static double percentEven(int[]dizi) {
        int sayac=0;

        for (int j : dizi) {
            if (j % 2 == 0) {
                sayac++;

            }
        }
        if(dizi.length==0) {
            return 0;
        }

        int yuzde;
        if(sayac>0) {

            yuzde=(sayac/dizi.length)*100;
            return yuzde;


        }
        return sayac;
    }
}
