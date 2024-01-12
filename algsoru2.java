import java.util.Arrays;

public class algsoru2 {

    public static void main(String[] args) {
        int list[]= {6,2,9,11,3};
        System.out.println(Arrays.toString(list));
        System.out.println(percentEven(list));

    }
    public static double percentEven(int[]list) {
        int cift=0;
        int yuzde=0;
        for(int i=0; i<list.length;i++) {
            if(list[i]%2==0) {
                cift++;
            }
        }
        if(list.length==0) {
            return 0;
        }
        if(cift>0) {
            yuzde=(cift*100)/list.length;
            return yuzde;

        }
        return yuzde;
    }
}