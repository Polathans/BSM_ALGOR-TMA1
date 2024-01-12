public class fizik1 {
    public static void main(String []args) {
        int akintihizi = 8;
        int nehirgenisligi = 60 ;
        int V1 = 10 ;
        int V2 = 10 ;
        int O1= 130;
        int O2 = 30;
        double Vx1 = V1 *Math.cos(Math.toRadians(O1));
        double Vy1 =V1*Math.sin(Math.toRadians(O1));
        double Vx2 = V2*Math.cos(Math.toRadians(O2)) ;
        double Vy2 = V2*Math.sin(Math.toRadians(O2));
        double t1 = nehirgenisligi / Vy1 ;
        double t2= nehirgenisligi / Vy2 ;
        double x1 = ( Vx1 + akintihizi ) * t1 ;
        double x2 = ( Vx2 + akintihizi ) * t2 ;
        double x3 = x2 - x1 ;
        System.out.println(" arasindaki uzaklik " +x3);




    }
}

