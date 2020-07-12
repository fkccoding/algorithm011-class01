import java.util.ArrayList;
import java.util.List;

/**
 * @author https://www.chuckfang.com
 * @date Created on 2020/7/12 23:26
 */
public class GenerateParentheses {
    List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        gen(0, 0, n, "");
        return res;

    }

    public void gen(int left, int right, int n, String s) {
        if (left == n && right == n) {
            res.add(s);
        }

        if (left < n) gen(left + 1, right, n, s + "(");

        if (left > right) gen(left, right + 1, n, s + ")");
    }

}
