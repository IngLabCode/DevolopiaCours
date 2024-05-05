package Lesson4;

public class Problem2 {
    public static void main(String[] args) {
        int a=0;
        int count=0;
        for(int j=1;j<j+1;j++){
          a=j;
        }
        for(int i=0;i<i+1;i++){
          if(i%a!=0  ){

              count++;
              if(count==34){
                  break;
              }

          }
            System.out.println(i);

        }
    }
}
