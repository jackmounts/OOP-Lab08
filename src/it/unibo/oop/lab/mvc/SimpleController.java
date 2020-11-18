package it.unibo.oop.lab.mvc;

import java.util.LinkedList;
import java.util.List;

/**
 *  Simple controller for SimpleGUI.
 */
public class SimpleController implements Controller {

    private String nextString;
    private final List<String> historyLog = new LinkedList<>();
    /*
     * methods implemented from interface
     */
    /**
     * Setter for the next string to print. 
     * Null values are not
     *      acceptable, and an exception should be produced
     *  @param string
     *          the string to set
     */
    public void setNextStringToPrint(final String string) {
        this.nextString = string;
    }
    /**
     * Getter for the next string to print.
     * 
     * @return next string to print
     */
    public String getNextStringToPrint() {
        return this.nextString;
    }
    /**
     * Getter for history of printed strings.
     * 
     * @return List of strings of the printed strings history
     */
    public List<String> getHistoryLogList() {
        return this.historyLog;
    }
    /**
     * Print current string.
     * 
     * @throws IllegalStateException if current string is unset
     */
    public void printString() {
        if (this.nextString == null) {
            throw new IllegalStateException("String to print is unset");
        } 
        this.historyLog.add(this.nextString);
        System.out.println(this.nextString);
    }

}
