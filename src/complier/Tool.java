package complier;

public class Tool {
    public static boolean isNumber(String str){
        String reg = "^[0-9]+(.[0-9]+)?$";
        return str.matches(reg);
    }
    public static boolean isIdentifier(String str){
        return true;
    }
}
