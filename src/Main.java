import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] num;
        int row;
        int col;
        System.out.println("nhap row: ");
        row = scanner.nextInt();
        System.out.println("nhap col: ");
        col = scanner.nextInt();
        num = new int[row][col];
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                num[i][j] = scanner.nextInt();
                if (i == j) {
                    sum += num[i][j];
                }
            }
        }


        System.out.println(sum);

    }
}