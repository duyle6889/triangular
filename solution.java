import java.util.Arrays;
class Solution {
  public int solution(int[] A) {
    int n = A.length;
    if (n < 3) {
      return 0;
    }
    Arrays.sort(A);
    for (int i = 0; i < n - 2; i++) {
      if ((long)A[i] + A[i + 1] > A[i + 2]) {
        return 1;
      }
    }
    return 0;
  }
}
