public class Pair<T, K> {
    private final T value1;
    private final K value2;

    public Pair(T value1, K value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T getFirst() {
        return value1;
    }
    public K getSecond() {
        return value2;
    }

    @Override
    public String toString() {
        return value1.toString() + "," + value2.toString();
    }
}
