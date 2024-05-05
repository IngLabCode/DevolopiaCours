package Lesson4;
public class Problem1 {
    public static void main(String[] args) {
        double gun = 0;
        double a = 1;//bagbanin verdiyi ilk su miqdari
        double l = 0.3;//agacin ilkin uzunlugu
        while (l < 10.0) {
            l++;
            a += a * 1.5;
        }
        gun = a / 15;
        System.out.println("gun =" + gun);
    }
}
