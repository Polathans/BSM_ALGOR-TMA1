public class algodev1 {
    public static void main(String[] args) {
        String p="polat";
        int a=p.indexOf("r");
        System.out.println(a);
        int[] x = {74, 85, 102, 99, 101, 85, 56};
        System.out.println(LastIndexOf(x, 85));
    }

    public static int LastIndexOf(int[] x, int a) {
        for (int i = x.length - 1; i >= 0; i--) {
            if (x[i] == a) {
                return i;
            }
        }
            for (int i = x.length - 1; i >= 0; i--) {
                if (x[i] != a) {
                    return -1;
                }


            }
            return 0;

        }
    }

