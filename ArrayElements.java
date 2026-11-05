import java.util.Scanner;

public class ArrayElements {
    int[][] enterElements(int rows, int columns, Scanner input) {
        int[][] numbers = new int[rows][columns];
        System.out.println("\nEnter the array elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element [" + (i + 1) + "][" + (j + 1) + "]: ");
                numbers[i][j] = input.nextInt();
            }
        }
        return numbers;
    }
}
