public class algsoru1 {
    public static void main(String[] args) {
        int[] list = { 74, 85, 102, 99, 101, 85, 56 };
        System.out.println(lastIndexOf(list, 85));
    }

    public static int lastIndexOf(int[] list, int number) {
        int sayac=0;
        int index=0;
        int p=0;
        int r=0;
        for(int j =0; j<list.length; j++) {
            if(number==list[j]) {
                index=j;
                sayac++;
            }
        }


        if(sayac==1) {
            p=index;
        }

        if(sayac>1) {
            r=index;
        }
        if(sayac==1) {

            return p;
        }
        else if(sayac>1) {

            return r;
        }

        else if(sayac==0) {

            return -1;
        }

        return sayac;
    }


}
