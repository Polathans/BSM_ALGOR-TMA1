public class hafta142 {
    public static void main(String[] args) {
        int[] list1={4,73,3,9,12,-47,3,74};
        System.out.println(isUnique(list1));
    }
    public static boolean isUnique(int[] list1){
       int sayac = 0;
        for (int i=0; i<list1.length; i++){
            for(int a=0; a<list1.length; a++){
                if (list1[i]==list1[a]) {
                    sayac++;
                }

                }
            if (sayac > 1) {
                return false;
            } else {
                sayac = 0;
            }
            }
        return true;
    }


}
