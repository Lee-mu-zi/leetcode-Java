public class Main {
    public static void main(String[] args) {
//        给你一个非负整数 x ，计算并返回 x 的 算术平方根 。
//        由于返回类型是整数，结果只保留 整数部分 ，小数部分将被 舍去
        int x = 8;
        int result = mySqrt(x);
        System.out.println(result);
    }

    public static int mySqrt(int x) {
        int left = 0;
        int right = x;
        int ans = -1;
        while (left <= right){
            //二分查找
            int mid = left + (right - left) / 2;
            if( mid * mid <= x){
                //结果可能存在于（mid , right]区间中
                //修改left等于mid + 1
                ans = mid;
                left = mid + 1;
            } else {
                //结果可能存在于[left , mid)区间中
                right = left - 1;
            }
        }
        return ans;
    }
}
