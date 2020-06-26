/**
 * @author https://www.chuckfang.com
 * @date Created on 2020/6/26 23:56
 */
public class ClimbStairs {
    public int climbStairs(int n) {
        double d = Math.sqrt(5);
        n++;
        return (int) ((Math.pow((1+d)/2,n) - Math.pow((1-d)/2,n)) / d + 0.5);
    }
}
