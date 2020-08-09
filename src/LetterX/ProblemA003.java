package LetterX;

/**
 * ProblemA003.java
 * @author Claude De-Tchambila
 * email: christ.tchambila@gmail.com
 */
public class ProblemA003 {

    public static void main(String[] args) {
//        printX(10);
//        printX(5, 40, 13 );
        printX(7, 75, 4 );
//        printX(5);
    }

    private static void printX(int sizeOfX, int x, int y) {
        if (!(sizeOfX >= 1 && sizeOfX <= 9)) {
            System.out.printf("Size %d must be between 1 and 9 both inclusive", sizeOfX);
            return;
        }

        final int rowCenter = y;
        final int columnCenter = x;

        final int targetedRowMin = Math.max(rowCenter - sizeOfX, 1);
        final int targetedRowMax = Math.min(rowCenter + sizeOfX, 25);


        for (int row = 1; row < 26; row++) {
            int targetedColMin = columnCenter - rowCenter + row;
            int targetedColMax = columnCenter + rowCenter - row;

            for (int column = 1; column < 80; column++) {

                if (row % 10 == 0 && column == 1) // 10th row
                    System.out.print(row / 10);
                else if (row == rowCenter && column == columnCenter) // center character "$"
                    System.out.print("$");
                else if ((row >= targetedRowMin && row <= targetedRowMax) && (column == targetedColMin || column == targetedColMax)){
                        System.out.print("$");
                }
                else if (column % 10 == 0) // 10th column
                    System.out.print(column / 10);
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }

}
