public class ArrayResult {
    void display(int[][] numbers, int[] rowTotals, int[] columnTotals) {
        int rows = numbers.length;
        int columns = numbers[0].length;
        int grandTotal = 0;

        System.out.println("\n2D ARRAY WITH ROW AND COLUMN SUMS:");
        printBorder(columns);
        System.out.printf("| %8s |", "Row");
        for (int j = 0; j < columns; j++) {
            System.out.printf(" %8s |", "Col " + (j + 1));
        }
        System.out.printf(" %8s |%n", "Row Sum");
        printBorder(columns);

        for (int i = 0; i < rows; i++) {
            System.out.printf("| %8s |", "Row " + (i + 1));
            for (int j = 0; j < columns; j++) {
                System.out.printf(" %8d |", numbers[i][j]);
            }
            System.out.printf(" %8d |%n", rowTotals[i]);
            printBorder(columns);
        }

        System.out.printf("| %8s |", "Col Sum");
        for (int j = 0; j < columns; j++) {
            System.out.printf(" %8d |", columnTotals[j]);
            grandTotal += columnTotals[j];
        }
        System.out.printf(" %8d |%n", grandTotal);
        printBorder(columns);
        System.out.println("GRAND TOTAL: " + grandTotal);
    }

    void printBorder(int columns) {
        System.out.print("+");
        for (int k = 0; k < columns + 2; k++) {
            System.out.print("----------+");
        }
        System.out.println();
    }
}
