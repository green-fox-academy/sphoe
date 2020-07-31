package symmetricmatrix;

import java.util.Arrays;

public class SymmetricMatrix {
  public static void main(String[] args) {
    int firstMatrix[][] = {{1, 0, 1}, {0, 2, 2}, {1, 2, 5}};
    int secondMatrix[][] = {{7, 7, 7}, {6, 5, 7}, {1, 2, 1}};

    System.out.println(
        "The matrix is :" + (Arrays.deepToString(firstMatrix)) + " " + isSymmetric(firstMatrix, 3));
    System.out.println(
        "The matrix is :" + (Arrays.deepToString(secondMatrix)) + " " +
            isSymmetric(secondMatrix, 3));
  }

  static boolean isSymmetric(int matrixTwoDimensional[][], int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (matrixTwoDimensional[i][j] != matrixTwoDimensional[j][i]) {
          return false;
        }
      }
    }
    return true;
  }
}