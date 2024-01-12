public class sasafasfasd {
    public static void main(String[] args) {
        String str = "Polathan Sinmez";
        int sayi;
        sayi=str.indexOf(" ");
        System.out.println("sayi:"+sayi);
        String s1,s2;
        s1=str.substring(0,sayi);
        s2=str.substring(sayi+1);
        System.out.println(s2+" "+s1);
    }
}
