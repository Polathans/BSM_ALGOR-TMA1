public class algsoru3 {
    public static void main(String[] args) {
        int[] list1 = {2,4,6};
        int[] list2 = {5,7,9};
        boolean süüü = allLess(list1,list2);
        System.out.println(süüü);
    }
    public static boolean allLess(int[] list1, int[] list2) {
        if(list1.length!=list2.length) {
            return false;
        }
        for(int i = 0; i<list1.length; i++) {
            if(list1[i] >= list2[i]) {
                return false;
            }
        }
        return true;
    }
}
