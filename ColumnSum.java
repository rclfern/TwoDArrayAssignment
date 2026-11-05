public class ColumnSum {
    int[] compute(int[][] numbers) {
        int[] totals = new int[numbers[0].length];
        for (int j = 0; j < numbers[0].length; j++) {
            for (int i = 0; i < numbers.length; i++) {
                totals[j] += numbers[i][j];
            }
        }
        return totals;
    }
}
