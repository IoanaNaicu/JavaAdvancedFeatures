package IO;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

import static java.lang.System.exit;

public class IO {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream defaultOutput = System.out;
        PrintStream fileOutput = new PrintStream("file.txt");
        try {
            int c = 32;
            do {
                if (c != 10) {
                    System.setOut(defaultOutput);
                    System.out.println("introduceti un caracter");
                }
                c = System.in.read();
                if (c!=10){
                    System.setOut(fileOutput);
                    System.out.println("Ati introdus caracterul " + (char) c + ". Codul ASCII este " + c);

                }
            }
            while (c != 32);
        } catch (IOException e) {
            System.err.println("Cannot read");
            exit(-1);
        }
    }
}
