package org.example.SparseArray;

public class demo {

    public static void main(String[] args) {
        // STEP1.创建一个原始的二维数组 11*11
        // 0表示没有棋子，1表示黑子，2表示篮子
        int[][] chessArray1 = new int[11][11];
        chessArray1[1][2] = 1;
        chessArray1[2][3] = 2;
        System.out.println("原始的二维数组");
        for (int[] row : chessArray1) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }

        // STEP2.将二维数组转稀疏数组
        // 遍历chessArray1，得到非0数据的个数
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (chessArray1[i][j] != 0) {
                    sum++;
                }
            }
        }

        // STEP3.创建稀疏数组
        int[][] sparseArray = new int[sum + 1][3];
        // 给稀疏数组赋值
        sparseArray[0][0] = 11;
        sparseArray[0][1] = 11;
        sparseArray[0][2] = sum;

        // 遍历chessArray1，将非0的值存放到sparseArray中
        int count = 0; // 用于记录是第几个非0数据
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (chessArray1[i][j] != 0) {
                    count++;
                    sparseArray[count][0] = i;
                    sparseArray[count][1] = j;
                    sparseArray[count][2] = chessArray1[i][j];
                }
            }
        }
        // 输出稀疏数组的形式
        System.out.println();
        System.out.println("得到稀疏数组为~~~~");
        for (int i = 0; i < sparseArray.length; i++) {
            System.out.printf("%d\t%d\t%d\t\n", sparseArray[i][0], sparseArray[i][1],
                sparseArray[i][2]);
        }

        // STEP4.将稀疏数组转成原始的二维数组，并显示出来
        // 1. 创建原始的二维数组，如：int chessArray2[11][11]
        int chessArray2[][] = new int[sparseArray[0][0]][sparseArray[0][1]];
        // 2. 读取稀疏数组中数据到二维数组中
        for (int i = 1; i < sparseArray.length; i++) {
            chessArray2[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
        }
        // 3. 显示恢复后的二维数组
        System.out.println();
        System.out.println("恢复后的二维数组为~~~~");
        for (int[] row : chessArray2) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }

    }
}
