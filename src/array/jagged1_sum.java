package array;

public class jagged1_sum {
    public static void main(String[] args) {
        int[][] data = { { 1, 2, 3, 4 },
                { 1, 2, 3 },
                { 1, 2 },
                { 1, } };

        int[] rowlength = new int[data.length];
        int sum = 0;

        for (int row = 0; row < data.length; row++) {
            rowlength[row] = data[row].length;
        }

        for (int col = 0; col < rowlength[0]; col++) {
            sum = 0;
            for (int row = 0; row < data.length; row++) {
                sum = sum + data[col][row];
            }
            System.out.println(sum);
        }

    }
}
