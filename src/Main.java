import java.io.*;
import org.antlr.v4.runtime.*;

public class Main {
    public static void main(String[] args) {
        try{
            CharStream input = CharStreams.fromFileName(args[0]);

             transpilerLexer analex = new  transpilerLexer(input);

            CommonTokenStream tokens = new CommonTokenStream(analex);

            transpilerParser anasint = new  transpilerParser(tokens);

            anasint.prg();
        } catch (org.antlr.v4.runtime.RecognitionException e) {
//Fallo al reconocer la entrada
            System.err.println("REC " + e.getMessage());
        } catch (IOException e) {
//Fallo de entrada/salida
            System.err.println("IO " + e.getMessage());
        } catch (java.lang.RuntimeException e) {
//Cualquier otro fallo
            System.err.println("RUN " + e.getMessage());
        }
    }
}