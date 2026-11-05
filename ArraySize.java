import java.util.Scanner;

public class ArraySize {
    Scanner input = new Scanner(System.in);
    int rows;
    int columns;

    void enterSize() {
        System.out.print("Enter number of rows: ");
        rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        columns = input.nextInt();

        if (rows <= 0 || columns <= 0) {
            System.out.println("Rows and columns must be positive.");
            System.exit(0);
        }
    }
}
