public class RowSum {
    int[] compute(int[][] numbers) {
        int[] totals = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                totals[i] += numbers[i][j];
            }
        }
        return totals;
    }
}
