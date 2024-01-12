public class fizik2 {
    public static void main(String []args) {
        int A = 8;
        int B = 6;
        int C = 3;
        int OA = 105;
        int OB = 30 ;
        int OC = 230 ;
        double Ax = A*Math.cos(Math.toRadians(OA));
        double Ay = A*Math.sin(Math.toRadians(OA));
        double Bx = B*Math.cos(Math.toRadians(OB));
        double By = B*Math.sin(Math.toRadians(OB));
        double Cx = C*Math.cos(Math.toRadians(OC));
        double Cy = C*Math.sin(Math.toRadians(OC));
        double Rx = Ax + Bx + Cx ;
        double Ry = Ay + By + Cy;
        System.out.println( Rx+ " + "+ Ry);
        double tx = Math.pow(Rx, 2);
        double ty = Math.pow(Ry , 2);
        double T = Math.pow((tx + ty), 0.5);
        System.out.println(T);
        double O2 =Ry/Rx;
        System.out.println(Math.toDegrees(Math.atan(O2)));

    }
}
