import java.util.Scanner;

public class Matrix {
    private int row;
    private int col;
    int[][] arr;

    public Matrix() {
    }

    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;
        arr = new int[row][col];
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int[][] getArr() {
        return arr;
    }

    public void setArr(int[][] arr) {
        this.arr = arr;
    }

    public void input() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                System.out.print("Enter " + "arr[" + i + "]" + "[" + j + "]" + " = ");
                this.arr[i][j] = input.nextInt();
            }
        }
    }

    public void printMatrix() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%5d", arr[i][j]);
            }
            System.out.println();
        }
    }

    public void addMatrix(Matrix matrix2) {
        int row1 = this.row, row2 = matrix2.getRow();
        int col1 = this.col, col2 = matrix2.getCol();
        int[][] arr1 = this.arr;
        int[][] arr2 = matrix2.getArr();

        if (col1 != col2 || row1 != row2) System.out.println("Không thể cộng hai ma trận !!!");
        int[][] result = new int[row1][col1];

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        // Show result
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.printf("%5d" ,result[i][j]);
            }
            System.out.println();
        }
    }

    public void subMatrix(Matrix matrix2) {
        int row1 = this.row, row2 = matrix2.getRow();
        int col1 = this.col, col2 = matrix2.getCol();
        int[][] arr1 = this.arr;
        int[][] arr2 = matrix2.getArr();

        if (col1 != col2 || row1 != row2) System.out.println("Không thể trừ hai ma trận !!!");
        int[][] result = new int[row1][col1];

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                result[i][j] = arr1[i][j] - arr2[i][j];
            }
        }

        // Show result
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.printf("%5d" ,result[i][j]);
            }
            System.out.println();
        }
    }

    public void multiMatrix(Matrix matrix2) throws Exception {
        int row1 = this.row;
        int col1 = this.col;
        int col2 = matrix2.getCol();
        int row2 = matrix2.getRow();

        if (col1 != row2) {
            throw new Exception("Không thể nhân hai ma trận !");
        }

        int[][] arr1 = this.arr;
        int[][] arr2 = matrix2.getArr();
        int[][] result = new int[row1][col2];

        try {
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    for (int k = 0; k < col1; k++) {
                        result[i][j] += arr1[i][k] * arr2[k][j];
                    }
                }
            }

            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[0].length; j++) {
                    System.out.printf("%5d", result[i][j]);
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
