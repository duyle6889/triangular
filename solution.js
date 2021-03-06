function solution(A) {
    let n = A.length;
    if (n < 3) {
      return 0;
    }
    A.sort((a, b) => a - b);
    for (let i = 0; i < n - 2; i++) {
      if (A[i] + A[i + 1] > A[i + 2]) {
        return 1;
      }
    }
    return 0;
}
