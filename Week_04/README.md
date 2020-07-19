学习笔记

下面是寻找一个半有序数组 [4, 5, 6, 7, 0, 1, 2] 中间无序的地方的代码
```java
public class Main {
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

```
