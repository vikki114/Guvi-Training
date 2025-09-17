package Day5;

public class SecondLargestNo {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 4, 45, 99};

        int first_largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > first_largest) {
                second_largest = first_largest;
                first_largest = numbers[i];
            } else if (numbers[i] > second_largest && numbers[i] < first_largest) {
                second_largest = numbers[i];
            }
        }

        if (second_largest == Integer.MIN_VALUE) {
            System.out.println("No second largest number found.");
        } else {
            System.out.println("Second largest number = " + second_largest);
        }
    }
}
