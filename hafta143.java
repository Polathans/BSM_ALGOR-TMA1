public class hafta143 {
    public static void main(String[] args) {
        double[] list1={16.1,12.3,22.2,14.4};
        double[] list3={1.5,2.3,7.0,19.5,25.1,46.2};
        double[] list2={4.1};
        System.out.println(isSorted(list1));
    }
    public static boolean isSorted(double[] list1){
        int sayac=0;
        if (list1.length==1)
            return true;
        for (int i=0; i<list1.length-1; i++){
            if (list1[i]<list1[i+1])sayac++;
        }
        if (sayac< list1.length-1) return false;
        return true;
    }
}
