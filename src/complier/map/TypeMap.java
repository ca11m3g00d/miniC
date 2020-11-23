package complier.map;

import complier.Tool;

public class TypeMap {
    public TypeMap() {
    }

    public static int LexToInt(String lex) {
        int type = 0;
        byte var3 = -1;
        switch(lex.hashCode()) {
        case -1325958191:
            if (lex.equals("double")) {
                var3 = 4;
            }
            break;
        case -934396624:
            if (lex.equals("return")) {
                var3 = 8;
            }
            break;
        case -567202649:
            if (lex.equals("continue")) {
                var3 = 14;
            }
            break;
        case -15970193:
            if (lex.equals("unsighed")) {
                var3 = 6;
            }
            break;
        case 35:
            if (lex.equals("#")) {
                var3 = 37;
            }
            break;
        case 37:
            if (lex.equals("%")) {
                var3 = 21;
            }
            break;
        case 40:
            if (lex.equals("(")) {
                var3 = 29;
            }
            break;
        case 41:
            if (lex.equals(")")) {
                var3 = 30;
            }
            break;
        case 42:
            if (lex.equals("*")) {
                var3 = 19;
            }
            break;
        case 43:
            if (lex.equals("+")) {
                var3 = 17;
            }
            break;
        case 44:
            if (lex.equals(",")) {
                var3 = 33;
            }
            break;
        case 45:
            if (lex.equals("-")) {
                var3 = 18;
            }
            break;
        case 47:
            if (lex.equals("/")) {
                var3 = 20;
            }
            break;
        case 59:
            if (lex.equals(";")) {
                var3 = 28;
            }
            break;
        case 60:
            if (lex.equals("<")) {
                var3 = 24;
            }
            break;
        case 61:
            if (lex.equals("=")) {
                var3 = 22;
            }
            break;
        case 62:
            if (lex.equals(">")) {
                var3 = 23;
            }
            break;
        case 91:
            if (lex.equals("[")) {
                var3 = 35;
            }
            break;
        case 93:
            if (lex.equals("]")) {
                var3 = 36;
            }
            break;
        case 123:
            if (lex.equals("{")) {
                var3 = 31;
            }
            break;
        case 125:
            if (lex.equals("}")) {
                var3 = 32;
            }
            break;
        case 1504:
            if (lex.equals("//")) {
                var3 = 34;
            }
            break;
        case 1921:
            if (lex.equals("<=")) {
                var3 = 26;
            }
            break;
        case 1952:
            if (lex.equals("==")) {
                var3 = 27;
            }
            break;
        case 1983:
            if (lex.equals(">=")) {
                var3 = 25;
            }
            break;
        case 3211:
            if (lex.equals("do")) {
                var3 = 11;
            }
            break;
        case 3357:
            if (lex.equals("if")) {
                var3 = 15;
            }
            break;
        case 101577:
            if (lex.equals("for")) {
                var3 = 10;
            }
            break;
        case 104431:
            if (lex.equals("int")) {
                var3 = 0;
            }
            break;
        case 3052374:
            if (lex.equals("char")) {
                var3 = 5;
            }
            break;
        case 3116345:
            if (lex.equals("else")) {
                var3 = 16;
            }
            break;
        case 3327612:
            if (lex.equals("long")) {
                var3 = 1;
            }
            break;
        case 3625364:
            if (lex.equals("void")) {
                var3 = 9;
            }
            break;
        case 94001407:
            if (lex.equals("break")) {
                var3 = 13;
            }
            break;
        case 94844771:
            if (lex.equals("const")) {
                var3 = 7;
            }
            break;
        case 97526364:
            if (lex.equals("float")) {
                var3 = 3;
            }
            break;
        case 109413500:
            if (lex.equals("short")) {
                var3 = 2;
            }
            break;
        case 113101617:
            if (lex.equals("while")) {
                var3 = 12;
            }
        }

        switch(var3) {
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
        case 10:
        case 11:
        case 12:
        case 13:
        case 14:
        case 15:
        case 16:
            type = 1;
            break;
        case 17:
        case 18:
        case 19:
        case 20:
        case 21:
        case 22:
        case 23:
        case 24:
        case 25:
        case 26:
        case 27:
            type = 2;
            break;
        case 28:
        case 29:
        case 30:
        case 31:
        case 32:
        case 33:
        case 34:
        case 35:
        case 36:
        case 37:
            type = 3;
            break;
        default:
            if (Tool.isNumber(lex)) {
                type = 4;
            } else if (Tool.isIdentifier(lex)) {
                type = 4;
            }
        }

        return type;
    }
}
