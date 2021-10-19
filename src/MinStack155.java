//设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
//
//
// push(x) —— 将元素 x 推入栈中。
// pop() —— 删除栈顶的元素。
// top() —— 获取栈顶元素。
// getMin() —— 检索栈中的最小元素。
//
//
//
//
// 示例:
//
// 输入：
//["MinStack","push","push","push","getMin","pop","top","getMin"]
//[[],[-2],[0],[-3],[],[],[],[]]
//
//输出：
//[null,null,null,null,-3,null,0,-2]
//
//解释：
//MinStack minStack = new MinStack();
//minStack.push(-2);
//minStack.push(0);
//minStack.push(-3);
//minStack.getMin();   --> 返回 -3.
//minStack.pop();
//minStack.top();      --> 返回 0.
//minStack.getMin();   --> 返回 -2.
//
//
//
//
// 提示：
//
//
// pop、top 和 getMin 操作总是在 非空栈 上调用。
//
// Related Topics 栈 设计 👍 1020 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class MinStack155 {

    /** initialize your data structure here. */
    int[] content ;
    int n = 16;
    int top = 0;
    public MinStack155() {
        content = new int[n];
    }

    public void push(int val) {
        top++;
        if (top<n){
            n+=4;
            int [] tem = new int[n];
            System.arraycopy(content,0,tem,0,content.length);
            content = tem;
        }
        content[top-1]=val;
    }

    public void pop() {
        top--;
    }

    public int top() {
        return content[top-1];
    }

    public int getMin() {
        int min =content[0];
        for (int i = 0; i < top; i++) {
            if (min>content[i]){
                min = content[i];
            }
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
//leetcode submit region end(Prohibit modification and deletion)
