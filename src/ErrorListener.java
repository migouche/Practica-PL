import org.antlr.v4.runtime.*;

public class ErrorListener extends BaseErrorListener {
    public static int errorCount = 0;

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        errorCount++;
        String errorType = (recognizer instanceof Lexer) ? "LÉXICO" : "SINTÁCTICO";
        String detalles = String.format("[%s] Línea %d:%d - %s", errorType, line, charPositionInLine + 1, msg.replace("mismatched input",
                "Elemento inesperado").replace("expecting", "Se esperaba"));
        System.err.println(detalles);
    }
}
