public class algodev3 {
    public static void main(String[] args) {
        int[] d1 = {2, 1, 6};
        int[] d2 = {3, 8, 9};
        System.out.println(allLess(d1, d2));

    }

    public static boolean allLess(int[] d1, int[] d2) {
        int sayac = 0;
        if (d1.length != d2.length){ return false;}
        for (int i = 0; i < d1.length; i++) {
            if (d1[i] < d2[i]){
                sayac++;
            }
        }
        if (sayac == d1.length) {return true;}
        return false;
    }
}
