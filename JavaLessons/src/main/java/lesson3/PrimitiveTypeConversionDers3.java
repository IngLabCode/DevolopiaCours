package lesson3;

public class PrimitiveTypeConversionDers3 {
    public static void main(String[] args) {
        //Ders praktikasi-1
        short a = 69;
        byte a2 = (byte) a;
        System.out.println(a2);
        short b = 589;
        byte b2 = (byte) b;
        System.out.println(b2);
        long c = 458;
        int c2 = (int) c;
        System.out.println(c2);
        long d = 52523635483l;
        int d2 = (int) d;
        System.out.println(d2);
        double e = 5632.6;
        float e2 = (float) e;
        System.out.println(e2);
        char f = 'A';
        int f2 = (int) f;
        System.out.println(f2);
        int g = 123;
        char g2 = (char) g;
        System.out.println(g2);
    }
}
