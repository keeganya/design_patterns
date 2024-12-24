import java.util.Arrays;

/**
 * @Author xiaohu
 * @Date 2024/11/6 15:29
 * @PackageName:PACKAGE_NAME
 * @ClassName: test
 * @Description: TODO
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        int[] a = {1,11,11,21,23,34,34,43};
//        System.out.println(binarySearchAlternative(a, 1));
//        System.out.println(binarySearchBalance(a, 34));
//        System.out.println(binarySearchLeftMost1(a, 11));
//        System.out.println(binarySearchRightMost1(a, 34));
//        System.out.println(binarySearchLeftMost2(a, 10));
//        System.out.println(binarySearchRightMost2(a, 35));

        int[] b = {1,89,54,15,65,73,58};
//        bubble(b);
//        bubble1(b,b.length-1);

        reversePrint(0,"abcd");

        System.out.println(f(5));

//        insertion(b,0);

        selectSort(b);
    }



    public static int binarySearchAlternative(int[] a,int target) {
        /*int i = 0,j = a.length - 1;
        while (i<=j) {
            int m = (i + j) >>> 1;
            if (target < a[m]) {
                j = m - 1;
            } else if (target > a[m]) {
                i = m + 1;
            } else {
                return m;
            }
        }
        return -1;*/
        int i = 0,j = a.length - 1;
        while (i<=j) {
            int m = (i + j) >>> 1;
            if (target < a[m]) {
                j = m - 1;
            } else if (target > a[m]) {
                i = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }

    public static int binarySearchBalance(int[] a,int target) {
        /*int i = 0,j = a.length - 1;
        while (1 < j - i) {
            int m = (i + j) >>> 1;
            if (target < a[m]) {
                j = m - 1;
            } else {
                i = m;
            }
        }
        if (a[i] == target) {
            return i;
        }
        return -1;*/
        int i = 0,j= a.length - 1;
        while (1<j-i){
            int m = (i+j)>>>1;
            if (target < a[m]) {
                j = m - 1;
            } else {
                i=m;
            }
        }
        if (a[i] == target) {
            return i;
        }
        return -1;
    }

    public static int binarySearchLeftMost1(int[] a,int target){
      /*  int i = 0,j = a.length - 1;
        int candidate = -1;
        while (i<=j) {
            int m = (i + j) >>> 1;
            if (target < a[m]) {
                j = m - 1;
            } else if (target > a[m]) {
                i = m + 1;
            } else {
                candidate = m;
                j = m - 1;
            }
        }
        return candidate;*/
        int i = 0,j = a.length -1 ;
        int candidate = -1;
        while (i<=j){
            int m = (i+j)>>>1;
            if (target < a[m]) {
                j = m - 1;
            } else if (target > a[m]) {
                i = m+ 1;
            } else {
                candidate = m;
                j = m- 1;
            }
        }
        return candidate;
    }

    public static int binarySearchRightMost1(int[] a,int target) {
        int i = 0,j = a.length - 1;
        int candidate = -1;
        while (i<=j){
            int m = (i + j) >>> 1;
            if (target < a[m]) {
                j = m - 1;
            } else if (target > a[m]){
                i = m + 1;
            } else {
                candidate = m;
                i = m + 1;
            }
        }
        return candidate;
    }

    public static int binarySearchLeftMost2(int[] a,int target) {
        /*int i = 0,j = a.length - 1;
        while (i<=j){
            int m = (i + j) >>> 1;
            if (target <= a[m]) {
                j = m - 1;
            } else {
                i = m + 1;
            }
        }
        return i;*/
        int i=0,j=a.length-1;
        while (i<=j){
            int m=(i+j) >>> 1;
            if (target <= a[m]) {
                j=m-1;
            } else {
                i=m+1;
            }
        }
        return i;
    }

    public static int binarySearchRightMost2(int[] a,int target) {
        int i = 0,j = a.length - 1;
        while (i <= j) {
            int m = (i + j) >>> 1;
            if (target < a[m]) {
                j = m - 1;
            } else {
                i = m + 1;
            }
        }
        return i - 1;
    }

    public static void bubble(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

    public static void bubble1(int[] a,int j){
        if (j == 0) {
            return;
        }
        for (int i = 0; i < j; i++) {
            if (a[i] > a[i+1]) {
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
        }
        System.out.println(Arrays.toString(a));
        bubble1(a,j-1);
    }

    public static void reversePrint(int n,String str) {
        if (n == str.length()) {
            return;
        }

        reversePrint(n+1,str);
        System.out.print(str.charAt(n));
    }

    public static int f(int n) {
        if (n == 1) {
            return 1;
        }
        return n * f(n - 1);
    }

    public static void insertion(int[] a,int low){
        if (low == a.length) {
            return;
        }
        int temp = a[low];
        int i = low - 1;

        while (i >= 0 && a[i] > temp){
            a[i+1] = a[i];
            i--;
        }

        if (i+1 != low) {
            a[i+1] = temp;
        }

        insertion(a,low+1);
        System.out.println(Arrays.toString(a));
    }

    public static void selectSort(int[] a) {
        for (int right = a.length - 1; right > 0; right--) {
            int max = right;
            for (int i = 0; i < right; i++) {
                if (a[i] > a[max]) {
                    max = i;
                }
            }
            if (max != right) {
                swap(a,max,right);
            }
        }
        System.out.println(Arrays.toString(a));
    }

    public static void swap(int[] a,int i,int j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
    }
}
