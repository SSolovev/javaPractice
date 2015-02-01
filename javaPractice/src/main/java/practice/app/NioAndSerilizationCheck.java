/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.app;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sergey
 */
public class NioAndSerilizationCheck {

    private File file;
    private Path path;

    public NioAndSerilizationCheck(String pathString) {
        file = new File(pathString);
        path = Paths.get(pathString);
    }

    public void printAllFilesInOneFolder() {
        int counter = 0;
        boolean isExist = Files.exists(path);
        System.out.println("is file exist: " + isExist);
        try (DirectoryStream<Path> st = Files.newDirectoryStream(path)) {
            for (Path p : st) {
                counter++;
                System.out.println(p.getFileName());
            }
            System.out.println("Counter: "+counter);
        } catch (IOException ex) {
            Logger.getLogger(NioAndSerilizationCheck.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void printAllFiles() throws IOException {
        Files.walkFileTree(path, new Visitor());
        
    }
}
