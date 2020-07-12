/**
 * @author https://www.chuckfang.com
 * @date Created on 2020/7/12 23:27
 */
public class PowN {
    public double myPow(double x, int n) {
        if(x == 0.00f) {
            return 0.00d;
        }
        long b = n;
        if (b < 0) {
            x = 1/x;
            b = -b;
        }

        double result = 1;

        while (b > 0) {
            if ((b & 1) == 1) {
                result *= x;
            }
            x *= x;
            b >>= 1;
        }
        return result;
    }
}
