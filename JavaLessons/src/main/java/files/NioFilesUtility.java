package files;

import java.io.File;
import java.nio.file.*;

public class NioFilesUtility {
    public void writeByte(byte[] data, String fileName) throws Exception {
        Path filePath = Paths.get(fileName);
        byte[] byteArray = Files.readAllBytes(filePath);
        Path filecopy = FileSystems.getDefault().getPath(",", "demo.txt");
        Files.write(filecopy, byteArray);
    }
}
