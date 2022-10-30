// 给你两个整数 x 和 y ，表示你在一个笛卡尔坐标系下的 (x, y) 处。同时，在同一个坐标系下给你一个数组 points ，其中 points[i] = [ai, bi] 表示在 (ai, bi) 处有一个点。当一个点与你所在的位置有相同的 x 坐标或者相同的 y 坐标时，我们称这个点是 有效的 。

// 请返回距离你当前位置 曼哈顿距离 最近的 有效 点的下标（下标从 0 开始）。如果有多个最近的有效点，请返回下标 最小 的一个。如果没有有效点，请返回 -1 。

// 两个点 (x1, y1) 和 (x2, y2) 之间的 曼哈顿距离 为 abs(x1 - x2) + abs(y1 - y2) 。

//  

// 示例 1：

// 输入：x = 3, y = 4, points = [[1,2],[3,1],[2,4],[2,3],[4,4]]
// 输出：2
// 解释：所有点中，[3,1]，[2,4] 和 [4,4] 是有效点。有效点中，[2,4] 和 [4,4] 距离你当前位置的曼哈顿距离最小，都为 1 。[2,4] 的下标最小，所以返回 2 。
// 示例 2：

// 输入：x = 3, y = 4, points = [[3,4]]
// 输出：0
// 提示：答案可以与你当前所在位置坐标相同。
// 示例 3：

// 输入：x = 3, y = 4, points = [[2,3]]
// 输出：-1
// 解释：没有 有效点。

class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int pointsLen = points.length;
        //方法一、思想是想记录全部的有效的点，用一个二维数组保存起来,再用一个一维数组保存下标
        //遍历保存着有效点的二维数组,找到最小的曼哈顿距离,
        // 且保存这个下标，这个下标存放的就是原数组的下标 
        // int res[][] = new int[pointsLen][2];
        // int resIndex = 0;
        // int[] index = new int[pointsLen];
        // for(int i = 0; i < pointsLen; i++) {
        //     if(points[i][0] == x || points[i][1] == y) {
        //         res[resIndex][0] = points[i][0];
        //         res[resIndex][1] = points[i][1];
        //         index[resIndex] = i;
        //         resIndex++;
        //     }
        // }
        // if(resIndex == 0) {
        //     return -1;
        // }
        // int minLen = Integer.MAX_VALUE;
        // int minIndex = 0;
        // for(int i = 0; i < resIndex; i++) {
        //     // minLen = Math.min(minLen, (Math.abs(x - res[i][0]) + Math.abs(y - res[i][1])));
        //     if(minLen > Math.abs(x - res[i][0]) + Math.abs(y - res[i][1])) {
        //         minLen = Math.abs(x - res[i][0]) + Math.abs(y - res[i][1]);
        //         minIndex = i; 
        //     } 
        // }
        // return index[minIndex];
        //这个方法好像是错的,因为,如果有多个相等的距离时,这个方法返回的下标没有表现出来？这种说法正确吗
        //显然是错的,因为最小的下标是必然,因为就是从前往后遍历,且判断条件是 < ,没有= 所以就算后面的索引有相等的值,也不会进入if语句,这时的索引就是最小的

        //方法二



        int minDistance = Integer.MAX_VALUE;//保存最小的曼哈顿距离
        // int distance;//保存曼哈顿距离
        int index = -1;
        for(int i = 0; i < pointsLen; i++) {
            if(points[i][0] == x || points[i][1] == y) {
                //算出曼哈顿距离
                if( minDistance > Math.abs(x - points[i][0]) + Math.abs(y - points[i][1])) {
                    minDistance = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
                    index = i;
                }
                //看这个距离是否小于最小的距离
                // if(distance < minDistance) {
                //     minDistance = distance;//小于时直接换
                //     index = i;//索引
                // }
                // } else if(distance == minDistance) {//如果相等时
                //     if(i < index) {//判断索引是否是最小的
                //         index = i;//不是
                //     }
                // }

            }
        }
        return index;
        
    }
}