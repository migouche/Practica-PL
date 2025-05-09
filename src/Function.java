import java.io.Console;
import java.util.ArrayList;

public class Function {


    private String nombre;
    private String tipo;
    private String retorno;
    private String blq;
    private ArrayList<String> params;

    public Function(String nombre, String tipo, String retorno, ArrayList<String> params, String blq ) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.retorno = retorno;
        this.params = params;
        this.blq = blq;
    }

    public String toString(){
        String traduccion = "";
        traduccion += tipo;
        traduccion += " " + nombre;
        traduccion += " (" + params + ")\n";
        traduccion += "{\n";
        traduccion += blq;
        traduccion += retorno;
        traduccion += "}\n";
        return traduccion;
    }

}
