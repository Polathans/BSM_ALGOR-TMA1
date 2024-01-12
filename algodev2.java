public class algodev2 {
    public static void main(String[] args) {
        int[] x={6,2,9,7,5};
        System.out.println(percentEven(x));
    }
    public static int percentEven(int[] x){
        int yuzde;
        int sayac=0;

        if (x.length==0) return 0;
        for (int i=0; i<x.length; i++){
            if (x[i]%2==0) sayac++;
        }
        yuzde=sayac*100/x.length;
        return yuzde;
    }
}
