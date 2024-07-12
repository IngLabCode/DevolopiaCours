package lesson6;
//Dərs praktikası-2
public class MethodsReturn {
    public static void main(String[] args) {
        Calculator nummiddle=new Calculator();
        System.out.println("print 1");
        nummiddle.average(5,8);
        System.out.println("print 2");
        nummiddle.average(8,9);


    }
}
class Calculator{
    public  int average(int num1,int num2){
        int avrg= (num1+num2)/2;
        System.out.println(avrg);
        return  avrg;
    }
}


