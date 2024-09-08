import java.util.Arrays;

public class Main {
    // 未完成
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] cards = {9,5,9,1,6,10,3,4,5,1};
        int cnt = 2;
        int i = solution.maxmiumScore(cards, cnt);
        System.out.println(i);
    }
}

class Solution {
    public int maxmiumScore(int[] cards, int cnt) {
        int[] arr = this.sort(cards);
        int res = 0;
        for (int i = 0; i < cnt - 1; i++) {
            res += arr[i];
        }
        for (int i = cnt - 1; i < cards.length; i++) {
            int temp = res;
            temp += arr[i];
            if (temp % 2 == 0 ){
                return temp;
            }
        }
        return 0;
    }

    public int[] sort(int[] cards) {
        // 拷贝一个新的数组，不会影响到原来的数组的值
        int[] arr = Arrays.copyOf(cards, cards.length);

        for (int i = 0; i < arr.length; i++) {
            // 设置一个flag 则表示此次循环没有进行交换，也就是待排序列已经有序，排序已经完成。
            boolean flag = true;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    // 位置交换 标注为false
                    flag = false;
                }
            }
            // 本次没有出现交换位置的情况 证明排序序列已经完成
            if (flag) {
                return arr;
            }
        }
        return arr;
    }
}