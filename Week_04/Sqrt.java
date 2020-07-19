/**
 * @author https://www.chuckfang.com
 * @date Created on 2020/7/19 23:00
 */
public class Sqrt {
    public int mySqrt(int x) {
        if(x == 0 || x == 1) {
            return x;
        }
        long left = 1;
        long right = x/2;

        while (left <= right) {
            long mid = (left + right)/ 2;
            long sqrt = mid * mid;
            if (sqrt == x) {
                return (int)Math.round(mid);
            } else if (sqrt > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return (int)Math.round(right);
    }
}
