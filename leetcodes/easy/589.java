// 给定一个 n 叉树的根节点  root ，返回 其节点值的 前序遍历 。

// n 叉树 在输入中按层序遍历进行序列化表示，每组子节点由空值 null 分隔（请参见示例）。


// 示例 1：



// 输入：root = [1,null,3,2,4,null,5,6]
// 输出：[1,3,5,6,2,4]


/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
     List<Integer> list = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if(root == null) {
            return null;
        }
        help(root);
        return list;
    }
    //这道题是每个结点用集合来存放他的子节点
    //所以只需要挨个将结点的childer 集合中的数据加入一个新的集合即可
    public void help(Node root) {
        if(root == null) {
            return;
        }
        list.add(root.val);
        for(Node node : root.children) {
            help(node);
        }
    }
}