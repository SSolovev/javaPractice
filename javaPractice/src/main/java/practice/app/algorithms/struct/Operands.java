package practice.app.algorithms.struct;

/**
 * Created by SeASolovev on 15.04.2015.
 */
public enum Operands {
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    private String value;

    Operands(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Operands fromString(String val){
        for (Operands o : Operands.values()){
            if(o.getValue().equals(val)){
                return o;
            }
        }
        return null;
    }
    @Override
    public String toString() {
        return value;
    }
}
