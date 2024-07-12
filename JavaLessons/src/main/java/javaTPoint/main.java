package javaTPoint;

import java.io.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args)throws Exception {
String fileName="aliyev.txt";
        File file=new File(fileName);
try(FileWriter fileWriter=new FileWriter(fileName);
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
      ){
    bufferedWriter.write("salmalar \n sagol");
}
FileReader fileReader=new FileReader(fileName);
Scanner bufferedReader=new Scanner(fileReader);
while (bufferedReader.hasNextLine()){
    String data=bufferedReader.nextLine();
    System.out.println(data);
}
fileReader.close();
bufferedReader.close();

if (file.exists()){
    System.out.println("filename :"+file.getName());
    System.out.println("AbsolutePath :"+file.getAbsoluteFile());
    System.out.println("Writable :"+file.canWrite());
    System.out.println("Readible :"+file.canRead());
    System.out.println("file size in the bytes :"+file.length());
    System.out.println("filename :"+file.getName());
}else {
    System.out.println("file is empty");
}
file.delete();



    }
}
