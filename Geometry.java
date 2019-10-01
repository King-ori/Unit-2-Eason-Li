public class Geometry{
    public static void main(String []args){
        int SIDES=7;
        double RADIUS=5.0;
        final double PI=22/7.0;
        int a=40;
        double y=6;
        double z;
        int b=6;

        z = (double) a / b;
        System.out.println("A heptagon has" +SIDES+ "sides");
        System.out.println("A decagon has" +(SIDES+3)+ "sides");
        System.out.println("Adodecagon has" +(SIDES+RADIUS)+ "sides");
        System.out.println("The circumference of a circle with radius of" +RADIUS+ "is "+(2*RADIUS*PI));
        System.out.println("z is"+ z);
    }
}
