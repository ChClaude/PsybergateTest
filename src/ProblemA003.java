/**
 * ProblemA003.java
 * @author Claude De-Tchambila
 * email: christ.tchambila@gmail.com
 */
public class ProblemA003 {

    public static void main(String[] args) {
//        printX(10);
//        printX(1);
        printX(6);
//        printX(5);
    }

    private static void printX(int sizeOfX) {
        if (!(sizeOfX >= 1 && sizeOfX <= 9)) {
            System.out.printf("Size %d must be between 1 and 9 both inclusive", sizeOfX);
            return;
        }

        final int rowCenter = 13;
        final int columnCenter = 40;

        final int targetedRowMin = rowCenter - sizeOfX;
        final int targetedRowMax = rowCenter + sizeOfX;

        int targetedColMin = columnCenter - sizeOfX;
        int targetedColMax = columnCenter + sizeOfX;
        boolean update = false;

        for (int row = 1; row < 26; row++) {

            for (int column = 1; column < 80; column++) {

                if (row % 10 == 0 && column == 1) // 10th row
                    System.out.print(row / 10);
                else if (row == rowCenter && column == columnCenter) // center character "$"
                    System.out.print("$");
                else if ((row >= targetedRowMin && row <= targetedRowMax) && (column == targetedColMin || column == targetedColMax)){
                        System.out.print("$");
                        update = true;
                }
                else if (column % 10 == 0) // 10th column
                    System.out.print(column / 10);
                else
                    System.out.print("=");
            }

            if (update) {
                targetedColMin++;
                targetedColMax--;
            }
            System.out.println();
        }
    }

}
