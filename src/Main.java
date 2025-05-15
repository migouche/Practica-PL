import java.io.*;
import org.antlr.v4.runtime.*;

public class Main {
    public static void main(String[] args) {
        try {
            String outputName = args[0];
            ErrorListener.errorCount = 0;

            CharStream input = CharStreams.fromFileName(args[0]);

            transpilerLexer analex = new transpilerLexer(input);
            analex.removeErrorListeners();
            analex.addErrorListener(new ErrorListener());

            CommonTokenStream tokens = new CommonTokenStream(analex);

            transpilerParser anasint = new transpilerParser(tokens);
            anasint.setOutputName(outputName);
            anasint.removeErrorListeners();
            anasint.addErrorListener(new ErrorListener());
            anasint.setErrorHandler(new DefaultErrorStrategy());

            anasint.prg();

            if (ErrorListener.errorCount > 0) {
                System.err.println("\nCodigo generado con " + ErrorListener.errorCount + " errores.");
            }

        } catch (IOException e) {
            System.err.println("Error de archivo: " + e.getMessage());
        }
    }
}
