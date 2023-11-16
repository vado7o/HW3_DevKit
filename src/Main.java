public class Main {
    public static void main(String[] args) {

        // Task 1
        System.out.println(Calculator.sum(2.34, 3));
        System.out.println(Calculator.multiply(2.33, 2));
        System.out.println(Calculator.divide(100.100, 10));
        System.out.println(Calculator.subtract(6.55, 2));

        System.out.println("-----------------------------------");
        // Task 2
        Integer[] arr1 = {1, 2, 3};
        String[] arr2 = {"one", "two", "three"};

        Integer[] arr3 = {4, 5, 6, 7};
        String[] arr4 = {"four", "five", "six", "seven"};

        Integer[] arr5 = {8, 9, 10};
        String[] arr6 = {"eight", "nine", "ten"};

        System.out.println(Task2.compareArrays(arr1, arr2));
        System.out.println(Task2.compareArrays(arr1, arr3));
        System.out.println(Task2.compareArrays(arr2, arr4));
        System.out.println(Task2.compareArrays(arr1, arr5));
        System.out.println(Task2.compareArrays(arr2, arr6));

        System.out.println("-----------------------------------");
        // Task3
        Pair pair = new Pair("dog", 5);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        String result = pair.toString();
        System.out.println(result);
    }
}