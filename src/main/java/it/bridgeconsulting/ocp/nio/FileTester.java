
package it.bridgeconsulting.ocp.nio;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileTester {
    
    public static void main(String[] args) {
        
        File f = new File("example.txt");
        System.out.println("File exists: " + f.exists());
        try {
            System.out.println("Created file: " + f.createNewFile());
        } catch (IOException ex) {
            System.err.println(ex);
        }
        
        System.out.println("Created file in: " + f.getAbsolutePath());
        System.out.println("File is directory: " + f.isDirectory());
        System.out.println("File is file: " + f.isFile());
        System.out.println("Deleted file: " + f.delete());
    }

}
