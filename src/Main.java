import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] num = {3.9, 25.65, -98.23, 52.12, -31.45, -325.232, 21.79, -986.21, -64.23, 51.11, -87.21, 66.12, -12.1, 44.9, -2.9};
        int quantity = 0;
        double totalSum = 0;
        boolean check = false;
        for (double number : num){
            if (number < 0){
                check = true;
            }
            if (number > 0 && check){
                totalSum = number + totalSum;
                quantity++;
            }
        }
        double average = totalSum / quantity;

        System.out.println("Среднее арифметическое число положительных в массиве: " + average);

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < num.length; i++) {
                if (num[i] < num[i-1]) {
                    double temp = num[i];
                    num[i] = num[i-1];
                    num[i-1] = temp;
                    isSorted = false;
                }
            }
        }
        System.out.println(Arrays.toString(num));
    }
}