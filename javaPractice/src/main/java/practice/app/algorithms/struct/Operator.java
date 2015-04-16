package practice.app.algorithms.struct;

/**
 * Created by SeASolovev on 15.04.2015.
 */
public enum Operator {
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    private String value;

    Operator(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Operator fromString(String val){
        for (Operator o : Operator.values()){
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
