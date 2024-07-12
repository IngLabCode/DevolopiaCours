package files;

import com.sun.jdi.event.StepEvent;

import java.io.*;

public class FileUtility2 {
    public void fileIntoWrite(String fileName, String text, boolean b) throws IOException {
        try (FileWriter fileWriter = new FileWriter(fileName);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        ) {
            bufferedWriter.write(text);
        }
    }

    public void fileIntoWrite(String fileName, String text) throws IOException {
        fileIntoWrite(fileName, text, true);
    }

    public void appendIntoFile(String fileName, String text) throws IOException {
        fileIntoWrite(fileName, text, false);
    }

}







