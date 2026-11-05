public class DuplicateChecker {
    void check(int[][] numbers) {
        System.out.println("\nDUPLICATE CHECKER:");
        boolean hasDuplicate = false;
        int rows = numbers.length;
        int columns = numbers[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int current = numbers[i][j];
                boolean seenBefore = false;
                boolean repeatedLater = false;

                // Check whether this value already appeared in an earlier cell.
                for (int a = 0; a < i * columns + j; a++) {
                    if (numbers[a / columns][a % columns] == current) {
                        seenBefore = true;
                        break;
                    }
                }

                if (!seenBefore) {
                    for (int a = i * columns + j + 1; a < rows * columns; a++) {
                        if (numbers[a / columns][a % columns] == current) {
                            repeatedLater = true;
                            break;
                        }
                    }
                    if (repeatedLater) {
                        System.out.println("Duplicate found: " + current);
                        hasDuplicate = true;
                    }
                }
            }
        }

        if (!hasDuplicate) {
            System.out.println("No duplicate elements found.");
        }
    }
}
