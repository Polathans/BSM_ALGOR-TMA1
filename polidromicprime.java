public class polidromicprime {
    public static void main(String[] args) {
        int c=0;
        int a=2;
        while(a<1000)  {
        for(int i=1; i<=a; i++) {
            if (a % i == 0) {
                c++;
            }}
            if (c == 2) {
                polidromicPrime(a);
                c=0;
                a++;
            } else {
                c=0;
                a++;

            }



        }

    }
    public static void polidromicPrime(int number) {
        int duzden = 0;
        int tersten=0 ;
        String b = String.valueOf(number);
        for (int r = 0; r < b.length(); r++) {
          duzden = Integer.parseInt(String.valueOf(b.charAt(r)));
            }
        for (int p=b.length()-1; p>=0; p--){
             tersten=Integer.parseInt(String.valueOf(b.charAt(p)));
        }
        if (duzden==tersten){
            System.out.print(b+" ");
        }
        }


    }





