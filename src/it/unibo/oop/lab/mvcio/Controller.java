package it.unibo.oop.lab.mvcio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

import javax.swing.JOptionPane;

/**
 * 
 */
public class Controller {

    /*
     * This class must implement a simple controller responsible of I/O access. It
     * considers a single file at a time, and it is able to serialize objects in it.
     * 
     * Implement this class with:
     * 
     * 1) A method for setting a File as current file
     * 
     * 2) A method for getting the current File
     * 
     * 3) A method for getting the path (in form of String) of the current File
     * 
     * 4) A method that gets a String as input and saves its content on the current
     * file. This method may throw an IOException.
     * 
     * 5) By default, the current file is "output.txt" inside the user home folder.
     * A String representing the local user home folder can be accessed using
     * System.getProperty("user.home"). The separator symbol (/ on *nix, \ on
     * Windows) can be obtained as String through the method
     * System.getProperty("file.separator"). The combined use of those methods leads
     * to a software that runs correctly on every platform.
     */
    private static final String HOME = System.getProperty("user.home");
    private static final String SEPARATOR = System.getProperty("file.separator");
    private static final String DEFAULT_OUTPUT = "output.txt";
    private File currentFile = new File(HOME + SEPARATOR + DEFAULT_OUTPUT);
    /**
     * File setter.
     * 
     * @param file
     */
    public void setCurrentFile(final File file) {
        if (file != null) {
            this.currentFile = file;
        } 
    }
    /**
     * File getter.
     * Doesn't check if @currentFile is null
     * 
     * @return currentFile
     */
    public File getCurrentFile() {
        return this.currentFile;
    }
    /**
     * File path getter.
     * 
     * @return currentFile path using {@link java.io.File.getPath}
     */
    public String getFilePath() {
        return this.currentFile.getPath(); 
    }
    /**
     * Saves the input string into the file.
     * 
     * @param input
     * 
     * @throws IOException if 
     */
    public void saveInput(final String input) throws IOException {
        try (PrintStream ps = new PrintStream(this.getFilePath())) {
            ps.print(input);
        }
    }

}
