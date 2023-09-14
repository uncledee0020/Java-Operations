public class LongsAndFloats {
    public static void main(String[] args){
        long x= 10L, y= 5L;
        System.out.format("x=%d \t y=%d", x, y);

        x *=y;

        System.out.println("\n\nAfter Multiplication");
        System.out.format("x=%d\t y=%d", x, y);

        double m=20.0, n=8.0;
        System.out.format("\n\nm=%f\t n=%f", m,n);

        m/=n;

        System.out.println("\nAfter Division");
        System.out.format("m=%.2f \t n=%.2f", m,n);
    }
}