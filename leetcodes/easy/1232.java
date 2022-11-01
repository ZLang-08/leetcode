// 给定一个数组 coordinates ，其中 coordinates[i] = [x, y] ， [x, y] 表示横坐标为 x、纵坐标为 y 的点。请你来判断，这些点是否在该坐标系中属于同一条直线上。

class Solution {
    public boolean checkStraightLine(int[][] c) {
        int len = c.length;
        // double x = Math.abs(coordinates[0][0] - coordinates[1][0]);
        // double y = Math.abs(coordinates[0][1] - coordinates[1][1]);
        // if(x != 0) {
        //     double k = y / x;
        //     for(int i = 1; i < len - 1; i++) {
        //         if(Math.abs(coordinates[i][0] - coordinates[i + 1][0]) == 0) {
        //             return false;
        //         }
        //         if(k != (Math.abs(coordinates[i][1] - coordinates[i + 1][1]) /
        //             Math.abs(coordinates[i][0] - coordinates[i + 1][0]))) {
        //             return false;
        //         }
        //     }
        //     return true;
        // } else {
        //     for(int i = 1; i < len - 1; i++) {
        //         if(Math.abs(coordinates[i][0] - coordinates[i + 1][0]) != 0) {
        //             return false;
        //         } 
        //     }
        //     return true;
        // }
        //存在的问题
        //1、就是我刚开始用int 保存了斜率 可能是小数
        //2、就算用double 保存,比较的时候也没办法
        //所以这个方法行不通
        //既然除法不行,那么乘法行不行呢
        int d1 = c[1][0] - c[0][0];
        int d2 = c[1][1] - c[0][1];
        for(int i = 1; i < len; i++) {
            if((c[i][0] - c[0][0]) * d2 != (c[i][1] - c[0][1]) * d1) {
                return false;
            }
        }
        return true;
    }
}