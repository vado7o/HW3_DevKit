public class Calculator {
    public Calculator() {}

    public static <T extends Number> Double sum(T first, T second) {
        return first.doubleValue() + second.doubleValue();
    }
    public static <T extends Number> Double multiply(T first, T second) {
        return first.doubleValue() * second.doubleValue();
    }
    public static <T extends Number> Double divide(T first, T second) {
        return first.doubleValue() / second.doubleValue();
    }
    public static <T extends Number> Double subtract(T first, T second) {
        return first.doubleValue() - second.doubleValue();
    }
}
