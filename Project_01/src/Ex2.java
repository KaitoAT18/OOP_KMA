public class Ex2 {
    public static void findAllPitago(int limit) {
        for (int a = 1; a < limit; a++) {
            for (int b = a; b < limit; b++) {
                int cSquare = a*a + b*b;
                int c = (int) Math.sqrt(cSquare);
                if (c <= limit && cSquare == c*c) {
                    System.out.println(a + " - " + b + " - " + c);
                }
            }
        }
    }

    public static void main(String[] args) {
        findAllPitago(500);
    }
}
