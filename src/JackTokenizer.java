import java.io.PrintWriter;
import java.util.Scanner;

/**
 * This class handles parsing a jack file, and writing the tokens parsed to an XML file.
 *
 * Algorithm:
 * 1|
 * 2|
 * 3|
 *
 * @author vincentii
 * @version 1.0
 */
public class JackTokenizer {

    // instanced variables
    private static char symbol;
    private static int intVal;
    private static String cleanInput;
    private static String stringVal;
    private static Keyword keyword;
    private static TokenType tokenType;
    private static Scanner inputFile;

    /**
     * Main Method, handles the driving of the program.
     * @param args ignored.
     */
    public static void main(String[] args) {
        System.out.print("Please enter a valid jack file to tokenize: ");
        
    }

    /**
     * handles parsing 1 line from the jack file.
     * @author vincent ii
     * @version 1.0
     */
    public static void advance() {

    }

    /**
     * Constructor for a new jackTokenizer object. Will setup the fileWriter.
     * @param fileName
     */
    public JackTokenizer(String fileName) {

    }


    /**
     * Handles writing entire tag line to a XML file using a printWriter.
     * @param tag the tag to write should be a keyword, or a identifier.
     * @param value the value to write, what goes inside of the tag.
     * @param writer the fileWriter to use to actually perform the write.
     */
    public static void printElement(String tag, String value, PrintWriter writer) {

    }

    /*
            GETTERS
     */

    public char getSymbol() {
        return symbol;
    }

    public int getIntVal() {
        return intVal;
    }

    public String getStringVal() {
        return stringVal;
    }

    public Keyword getKeyword() {
        return keyword;
    }

    public TokenType getTokenType() {
        return tokenType;
    }

}
