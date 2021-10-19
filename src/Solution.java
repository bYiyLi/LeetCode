//给定一个单词数组和一个长度 maxWidth，重新排版单词，使其成为每行恰好有 maxWidth 个字符，且左右两端对齐的文本。
//
// 你应该使用“贪心算法”来放置给定的单词；也就是说，尽可能多地往每行中放置单词。必要时可用空格 ' ' 填充，使得每行恰好有 maxWidth 个字符。
//
// 要求尽可能均匀分配单词间的空格数量。如果某一行单词间的空格不能均匀分配，则左侧放置的空格数要多于右侧的空格数。
//
// 文本的最后一行应为左对齐，且单词之间不插入额外的空格。
//
// 说明:
//
//
// 单词是指由非空格字符组成的字符序列。
// 每个单词的长度大于 0，小于等于 maxWidth。
// 输入单词数组 words 至少包含一个单词。
//
//
// 示例:
//
// 输入:
//words = ["This", "is", "an", "example", "of", "text", "justification."]
//maxWidth = 16
//输出:
//[
//   "This    is    an",
//   "example  of text",
//   "justification.  "
//]
//
//
// 示例 2:
//
// 输入:
//words = ["What","must","be","acknowledgment","shall","be"]
//maxWidth = 16
//输出:
//[
//  "What   must   be",
//  "acknowledgment  ",
//  "shall be        "
//]
//解释: 注意最后一行的格式应为 "shall be    " 而不是 "shall     be",
//     因为最后一行应为左对齐，而不是左右两端对齐。
//     第二行同样为左对齐，这是因为这行只包含一个单词。
//
//
// 示例 3:
//
// 输入:
//words = ["Science","is","what","we","understand","well","enough","to",
//"explain",
//         "to","a","computer.","Art","is","everything","else","we","do"]
//maxWidth = 20
//输出:
//[
//  "Science  is  what we",
//  "understand      well",
//  "enough to explain to",
//  "a  computer.  Art is",
//  "everything  else  we",
//  "do                  "
//]
//
// Related Topics 字符串 模拟 👍 208 👎 0


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {


    public static void main(String[] args) {
        final List<String> strings = fullJustify(new String[]{"Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"}
        ,20);
        System.out.println(strings);;
    }
    public static List<String> fullJustify(String[] words, int maxWidth) {
        int n=0;
        List<String> list = new ArrayList<>();
        while (n<words.length){
            int wordSize = 0;
            int max = 0;
            for (int now=n;now<words.length&&wordSize<maxWidth;now++){
                if ((wordSize+words[now].length()) > maxWidth){
                    max = now-1;
                    break;
                }else {
                    wordSize+=words[now].length();
                }
                wordSize++;
                max = now;
            }
            wordSize-=(max-n+1);
            int d;
            if ((max-n)==0){
               d = 1;
            }else {
                 d = (max-n);
            }
            int d2=(maxWidth-wordSize)%d;
            d = (maxWidth-wordSize)/d;
            StringBuilder builder = new StringBuilder();
            for (int t=n;t<=max;t++){
                builder.append(words[t]);
                int tm=d;
                if (t==n){
                    tm+=d2;
                }
                builder.append(" ".repeat(tm));
            }
            list.add(builder.substring(0,maxWidth));
            n=max+1;
        }
        StringBuilder builder = new StringBuilder();
        final String s = list.get(list.size() - 1);
        list.remove(s);
        final String[] s1 = s.split(" ");
        for (String ss:s1){
            if (ss.isBlank()){
                continue;
            }
            builder.append(ss).append(" ");
        }
        builder.append(" ".repeat(maxWidth-builder.length()));
        list.add(builder.toString());
        return list;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
