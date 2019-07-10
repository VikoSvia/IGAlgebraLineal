package edu.ujcv.progra2.matriz;

public class IGMatR3 {

    void rotateMatrix(int[][] mat)
    {
        int N=3;

        for (int x = 0; x < N / 2; x++)
        {
            for (int y = x; y < N-x-1; y++)
            {

                int temp = mat[x][y];

                mat[x][y] = mat[y][N-1-x];

                mat[y][N-1-x] = mat[N-1-x][N-1-y];

                mat[N-1-x][N-1-y] = mat[N-1-y][x];

                mat[N-1-y][x] = temp;
            }
        }
    }

    void printMatrix(int[][] M){
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                System.out.print("[" + M[i][j] + "]");
            }
            System.out.println();
        }
    }

}
