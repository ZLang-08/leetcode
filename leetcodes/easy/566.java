// 在 MATLAB 中，有一个非常有用的函数 reshape ，它可以将一个 m x n 矩阵重塑为另一个大小不同（r x c）的新矩阵，但保留其原始数据。

// 给你一个由二维数组 mat 表示的 m x n 矩阵，以及两个正整数 r 和 c ，分别表示想要的重构的矩阵的行数和列数。

// 重构后的矩阵需要将原始矩阵的所有元素以相同的 行遍历顺序 填充。

// 如果具有给定参数的 reshape 操作是可行且合理的，则输出新的重塑矩阵；否则，输出原始矩阵。

//  

// 示例 1：


// 输入：mat = [[1,2],[3,4]], r = 1, c = 4
// 输出：[[1,2,3,4]]
// 示例 2：


// 输入：mat = [[1,2],[3,4]], r = 2, c = 4
// 输出：[[1,2],[3,4]]

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        //方法一、
        // int[][] res = new int[r][c];
        // int len = mat.length;
        // int len1 = mat[0].length;
        // int rowIndex = 0;
        // int columnIndex = 0;
        // if(len * len1 != c * r) {
        //     return mat;
        // }
        // for(int i = 0; i < len; i++) {
        //     // int len1 = mat[i].length;
        //     if(len1 != 0) {
        //         for(int j = 0; j < len1; j++) {
        //             if(columnIndex == c) {
        //                 columnIndex = 0;
        //                 rowIndex++;
        //             }
        //             res[rowIndex][columnIndex++] = mat[i][j];
        //         }
        //     } else {
        //         if(columnIndex == c) {
        //             columnIndex == 0;
        //             rowIndex++;
        //         }
        //         res[rowIndex][columnIndex++] = mat[i][0];
        //     }
        // }
        // return res;
        //方法二、 学到了,二维数组还可以这样整
        int len1 = mat.length;
        int len2 = mat[0].length;
        int[][] res = new int[r][c];
        if(len1 * len2 != r * c) {
            return mat;
        }
        for(int i = 0; i < len1 * len2; i++) {
            res[i / c][i % c] = mat[i / len2][i % len2];
        }
        return res;


    }
}