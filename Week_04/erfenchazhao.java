/**
 * @author https://www.chuckfang.com
 * @date Created on 2020/7/19 23:24
 */
public class erfenchazhao {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};

        int max = getMax(arr);

        System.out.println(max);
    }

    private static int getMax(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > left) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return arr[left - 1];
    }
}
