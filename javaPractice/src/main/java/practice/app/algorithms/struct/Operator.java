package practice.app.algorithms.struct;

/**
 * Created by SeASolovev on 15.04.2015.
 */
public class Operator {
//    PLUS("+", 1),
//    MINUS("-", 1),
//    MULTIPLY("*", 2),
//    DIVIDE("/", 2);

    private String value;


    private int priority;

    public Operator(String value, int priority) {
        this.value = value;
        this.priority = priority;
    }

    public String getValue() {
        return value;
    }

    public int getPriority() {
        return priority;
    }

    public static Operator fromString(String val, int priorityBonus) {
        switch (val) {
            case "+":
            case "-": {
                return new Operator(val, 1+priorityBonus);
            }

            case ("*"):
            case ("/"): {
                return new Operator(val, 2+priorityBonus);
            }
        }
        return null;
    }

    public static Operator fromChar(char val, int priorityBonus) {
        return fromString(String.valueOf(val),priorityBonus);
    }

    @Override
    public String toString() {
        return value;
    }
}
