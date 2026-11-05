public class MainProgram {
    public static void main(String[] args) {
        ArraySize size = new ArraySize();
        size.enterSize();

        ArrayElements elements = new ArrayElements();
        int[][] numbers = elements.enterElements(size.rows, size.columns, size.input);

        RowSum row = new RowSum();
        int[] rowTotals = row.compute(numbers);

        ColumnSum column = new ColumnSum();
        int[] columnTotals = column.compute(numbers);

        ArrayResult result = new ArrayResult();
        result.display(numbers, rowTotals, columnTotals);

        DuplicateChecker checker = new DuplicateChecker();
        checker.check(numbers);
    }
}
