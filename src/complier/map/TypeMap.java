package complier.map;

import complier.Tool;

public class TypeMap {
    public static int LexToInt(String lex){
        int type=0;
        switch(lex){
            case "int":
            case "long":
            case "short":
            case "float":
            case "double":
            case "char":
            case "unsighed":
            case "const":
            case "return":
            case "void":
            case "for":
            case "do":
            case "while":
            case "break":
            case "continue":
            case "if":
            case "else":
                //keywords
                type=1;
                break;
            case "+":
            case "-":
            case "*":
            case "/":
            case "%":
            case "=":
            case ">":
            case "<":
            case ">=":
            case "<=":
            case "==":
                //operator
                type=2;
                break;
            case ";":
            case "(":
            case ")":
            case "{":
            case "}":
            case ",":
            case "//":
            case "[":
            case "]":
            case "#":
                //delimiter
                type=3;
                break;
            default:
                if(Tool.isNumber(lex)){
                    //Number
                    type=4;
                    break;
                }
                else if(Tool.isIdentifier(lex)){
                    type=4;
                    break;
                }
        }
        return type;
    }
}
