package be.intecbrussel.method_references;

public interface TextUtil {

    static String quote(String s){
        return String.format("<<%s>>",s);
    }
}
