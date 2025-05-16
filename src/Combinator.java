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

    public String createConstLit(String constLit){
        return constLit.replace('\'','"');
    }

    public String createFunction(String ID,String formal_paramlist, String tbas, String blq){
        String result;
        result = tbas;
        result += " " + ID + " ";

        if(formal_paramlist.isEmpty()){
            result += "( void )";
        }else{
            result += fixFormalParamList(formal_paramlist);
        }
        result += "{\n";
        result += fixReturn(ID,blq);
        result += "}\n";
        return result;
    }

    private String fixReturn(String id, String blq){
        StringBuilder result = new StringBuilder();
        String[] lines = blq.split("\n");

        for (String line : lines) {
            if (line.contains(id + "=")) {
                result.append("\t".repeat(line.indexOf(line.trim()))).
                        append("return ").
                        append(line.split("=")[1].trim()).
                        append("\n");
            } else {
                result.append(line).append("\n");
            }
        }
        return result.toString();
    }

    private String fixFormalParamList(String formal_paramlist){
        StringBuilder result = new StringBuilder();
        result.append("(");

        formal_paramlist = formal_paramlist.substring(1, formal_paramlist.length() - 1);

        String[] params = formal_paramlist.split(",");
        String type = params[0].split(" ")[0];

        for (String param : params) {
            String[] parts = param.trim().split(" ");
            if (parts.length == 1) {
                result.append(type).append(" ").append(parts[0]).append(", ");
            } else {
                result.append(parts[0]).append(" ").append(parts[1]).append(", ");
                type = parts[0];
            }
        }
        // remove last comma and space
        if (!result.isEmpty()) {
            result.setLength(result.length() - 2);
        }
        result.append(")");
        return result.toString();
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
        result += "\t".repeat(tabs) + "}\n";
        return result;
    }

    public String createWhile(String expcond, String blq, int tabs){
        String result;
        result = "\n";
        result += "\t".repeat(tabs);
        result += "while (";
        result += expcond;
        result += ") {\n";
        result += blq;
        result += "\t".repeat(tabs) + "}\n";
        return result;
    }

    public String createDo(String blq, String expcond, int tabs){
        String result;
        result = "\n";
        result += "\t".repeat(tabs);
        result += "do\n";
        result += blq;
        result += "\t".repeat(tabs);
        result += "until ";
        result += expcond;
        result += ";\n";
        return result;
    }

    public String createFor(String ID, String exp1, String inc, String exp2, String blq, int tabs) {
        String result;
        String sign;

        result = "\n";
        result += "\t".repeat(tabs);
        result += "for";
        result += "( ";
        result += ID;
        result += "=";
        result += exp1;
        result += "; ";
        result += ID;
        result += inc;
        result += exp2;
        if(inc.equals("<")) sign="+";
        else sign="-";
        result += sign;
        result += "1; ";
        result += ID + "="+ID;
        result += sign + "1";
        result += "){\n";
        result += blq;
        result += "\t".repeat(tabs) + "}\n";
        return result;
    }

}
