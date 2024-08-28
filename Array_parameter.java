public class Array_parameter {

    public static void main(String[] args) {
        int[] numbers = {11, 42, -5, 27, 0, 89};
        System.out.println("The average is: " + calculateAverage(numbers));
    }
  
    public static double calculateAverage(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return (double) sum / numbers.length;
    }
}
