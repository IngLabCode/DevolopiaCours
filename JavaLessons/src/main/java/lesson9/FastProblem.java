package lesson9;

public class FastProblem {
    public static void main(String[] args) {
      speed(10.0,10.0,0.25);
    }
    public static void speed(double lengthOfRoad,double lengthOfCar,double allTime ){
        double speedOfCar =lengthOfRoad/allTime;
        double lengthOfBridge=lengthOfRoad*3.0/100;
        double time=(lengthOfBridge+lengthOfCar)/speedOfCar;
        System.out.println("time : "+time);

    }

}
