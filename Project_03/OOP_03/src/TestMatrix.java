public class TestMatrix {
    public static void main(String[] args) throws Exception {
        Matrix matrix1 = new Matrix(2, 3);
        System.out.println("Enter matrix1: ");
        matrix1.input();
        System.out.println("Print matrix1: ");
        matrix1.printMatrix();
        System.out.println("--------------------");
        Matrix matrix2 = new Matrix(2, 3);
        System.out.println("Enter matrix2: ");
        matrix2.input();
        System.out.println("Print matrix2: ");
        matrix2.printMatrix();
//
//        System.out.println("--------------------");
//        System.out.println("Sum matrix: ");
//        matrix1.addMatrix(matrix2);
//
//        System.out.println("--------------------");
//        System.out.println("Subtract matrix: ");
//        matrix1.subMatrix(matrix2);

        System.out.println("--------------------");
        System.out.println("Multiple matrix: ");
        matrix1.multiMatrix(matrix2);
    }
}
