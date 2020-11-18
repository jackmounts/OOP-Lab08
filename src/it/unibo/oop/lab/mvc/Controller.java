package it.unibo.oop.lab.mvc;

import java.util.List;

/**
 * A controller that prints strings and has memory of the strings it printed.
 */
public interface Controller {

    /*
     * This interface must model a simple controller responsible of I/O access. It
     * considers only the standard output, and it is able to print on it.
     * 
     * Write the interface and implement it in a class in such a way that it
     * includes:
     * 
     * 1) A method for setting the next string to print. Null values are not
     * acceptable, and an exception should be produced
     * 
     * 2) A method for getting the next string to print
     * 
     * 3) A method for getting the history of the printed strings (in form of a List
     * of Strings)
     * 
     * 4) A method that prints the current string. If the current string is unset,
     * an IllegalStateException should be thrown
     * 
     */
    /**
     * Setter for the next string to print. 
     * Null values are not
     *      acceptable, and an exception should be produced
     *  @param string
     *          the string to set
     */
    void setNextStringToPrint(String string);
    /**
     * Getter for the next string to print.
     * 
     * @return next string to print
     */
    String getNextStringToPrint();
    /**
     * Getter for history of printed strings.
     * 
     * @return List of strings of the printed strings history
     */
    List<String> getHistoryLogList();
    /**
     * Print current string.
     * 
     * @throws IllegalStateException if current string is unset
     */
    void printString();
}
