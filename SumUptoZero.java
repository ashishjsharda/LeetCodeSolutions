import java.util.Arrays;

/**
 * <a href> https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/</a>
 *
 * @author ashish
 */
public class SumUptoZero {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = i + 1;
            arr[i + 1] = -arr[i];
        }
        return arr;

    }

    public static void main(String[] args) {

        SumUptoZero sumUptoZero = new SumUptoZero();
        Arrays.stream(sumUptoZero.sumZero(5)).forEach(System.out::println);
    }
}
