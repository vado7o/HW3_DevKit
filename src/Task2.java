public class Task2 {
    public Task2() {}

    public static <T, K> boolean compareArrays(T[] arr1, K[] arr2) {
        return (arr1.length == arr2.length && arr1[0].getClass() == arr2[0].getClass());
    }
}
