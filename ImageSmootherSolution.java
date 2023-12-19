class ImageSmootherSolution {
    public int[][] imageSmoother(int[][] img) {
        if (img == null || img.length == 0 || img[0].length == 0) {
            return new int[0][0];
        }

        int rows = img.length;
        int cols = img[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = calculateAverage(img, i, j);
            }
        }

        return result;
    }

    private int calculateAverage(int[][] img, int row, int col) {
        int rows = img.length;
        int cols = img[0].length;
        int sum = 0;
        int count = 0;

        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (i >= 0 && i < rows && j >= 0 && j < cols) {
                    sum += img[i][j];
                    count++;
                }
            }
        }

        return sum / count;
    }
}
