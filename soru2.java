public class soru2 {
    public static void main(String[] args) {
        for(int p=1; p<=5; p++){
            for(int r=4; r>=p; r--){
                System.out.print("+");
            }

            System.out.println(p);
        }

        for(int a=5; a>=1; a--){
            for(int b=1; b<=(5-a) ; b++){

                System.out.print("*");
            }
            System.out.println(a);
        }
        System.out.println("BAŞARILI");
    }
}