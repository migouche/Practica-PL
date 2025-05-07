import java.util.ArrayList;
import java.util.List;

public class Combinator {
    private ArrayList<String> result;

    public Combinator() {
        result = new ArrayList<>();
    }

    public void addToCombinator(String word) {
        result.add(word);
    }

    public String toString(){
        return result.toString();
    }

    /*public String createFor(String ID, String exp1, String INC, String exp2, String blq) {
        String result;
        result = "for";
        result += ""
    }*/

    public String createFunction(String ID,String formal_paramlist, String tbas, String blq){
        String result;
        result = tbas;
        result += " " + ID + " ";
        if(formal_paramlist.isEmpty()){
            result += "( void )";
        }else{
            result += formal_paramlist;
        }
        result += "{\n";
        result += blq;
        result += "}\n";
        return result;
    }

    public String createConst(String ID, String simpvalue){
        String result;
        result = "#define ";
        result += ID;
        result += " ";
        result += simpvalue;
        result += "\n";
        return result;
    }

    public String createVarlist(String varlist, String tbas){
        String result;
        result = tbas;
        result += " ";
        result += varlist;
        //result += ";\n";
        return result;
    }

    public String createIf(String expcond, String blq, int tabs){
        String result;
        result = "\n";
        result += "\t".repeat(tabs);
        result += "if ";
        result += "(";
        result += expcond;
        result += ") {\n";
        result += blq;
        result += "\t".repeat(tabs) + "}";
        return result;
    }

    public String createElse(String blq, int tabs){
        String result;
        result = " else";
        result += "{\n";
        result +=  blq;
        result += "\t".repeat(tabs) + "}";
        return result;
    }
}
