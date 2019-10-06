package Exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.impl.SimpleLogger;

import java.io.IOException;

public class App {

    static {
        System.setProperty(SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
    }
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
//        double result = 5/0;
        try {
            System.out.println(division(1, 2));
            System.out.println(division(1, 0));
        } catch (IOException e) {
//            System.out.println("catch");
            LOGGER.error("a fost prinsa exceptia cu mesajul '{}'.", e.getMessage());
        } finally {
            System.out.println("finally");
        }

    }

    static double division(int a, int b) throws IOException {
        try {
            LOGGER.debug("Urmeaza impartirea lui {} la {}", a, b);
            return a / b;
        } catch (ArithmeticException e) {
            throw new IOException("iMPARTIRE LA 0", e);
        }
    }
}
