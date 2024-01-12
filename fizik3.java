public class fizik3 {
    public static void main(String[] args) {
        int V = 19;
        int Kcizgisi = 35 ;
        int Teta = 35 ;
        double hdirek = 2.44 ;
        double g = 9.8 ;
        double Vx = V * Math.cos(Math.toRadians(Teta));
        double Vy = V * Math.sin(Math.toRadians(Teta));
        double Tcik = Vy/g ;
        double Tuc = 2 * Tcik ;
        double Rmenzil = Vx *Tuc ;
        if (Rmenzil >Kcizgisi ) {
            System.out.println("Menzil "+ Rmenzil);

        }
        double Tkale = Kcizgisi / Vx;
        double y = Vy * Tkale - 0.5 * g * Tkale * Tkale;
        if (y < hdirek && y > 0 ) {
            System.out.println("Top diregin altindan gecmis ve Gol olmus "+ " Topun yerden yuksekligi = "+ y +" Vx =  " + Vx +" Vy = " + Vy );
        }
        else if (y > hdirek)  {
            System.out.println("Top diregin ustune gecmis ve Gol olmamis "+ " Topun yerden yuksekligi= "+ y +" Vx = " + Vx +" Vy =" + Vy);
        }
        else if (y < 0) {
            System.out.println(" Top Kaleye ulasmaz ve Gol olmaz! "  + "  Menzil = " + Rmenzil +" Vx=  " + Vx +" Vy = " + Vy );
        }
    }
}
