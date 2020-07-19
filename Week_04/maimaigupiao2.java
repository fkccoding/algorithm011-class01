/**
 * @author https://www.chuckfang.com
 * @date Created on 2020/7/19 23:00
 */
public class maimaigupiao2 {
    public int maxProfit(int[] prices) {
        int sum = 0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i-1]) {
                sum += prices[i] - prices[i-1];
            }
        }
        return sum;
    }
}
