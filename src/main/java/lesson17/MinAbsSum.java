package lesson17;

import java.util.Arrays;

public class MinAbsSum {
    /**
     * N 정수의 주어진 배열 A와 집합 {−1, 1}의 N 정수 시퀀스 S에 대해 val(A, S)를 다음과 같이 정의합니다.
     * val(A, S) = |sum{ A[i]*S[i] for i = 0..N−1 }|
     * (0 요소의 합이 0이라고 가정합니다.)
     * 주어진 배열 A에 대해 val(A,S)를 최소화하는 시퀀스 S를 찾고 있습니다.
     * 함수 작성:
     * 클래스 솔루션 { 공개 int 솔루션(int[] A); }
     * N 정수의 배열 A가 주어지면 집합 {−1, 1}에서 N 정수의 모든 가능한 시퀀스 S에 대해 val(A,S)의 모든 가능한 값에서 val(A,S)의 최소값을 계산합니다.
     * 예를 들어, 주어진 배열:
     *   A[0] = 1
     *   A[1] = 5
     *   A[2] = 2
     *   A[3] = -2
     * S = [−1, 1, −1, 1]의 경우 val(A, S) = 0(가능한 최소값)이므로 함수는 0을 반환해야 합니다.
     * 다음 가정에 대한 효율적인 알고리즘을 작성하십시오.
     * N은 [0..20,000] 범위 내의 정수입니다.
     * 배열 A의 각 요소는 [−100..100] 범위의 정수입니다.
     */
    public static void main(String[] args) {
        int[] A = {1, 5, 2, -2};
        System.out.println("solution(A) = " + solution(A));
    }

    static int solution(int[] A) {

        int maxSum = 0;
        for (int i = 0; i < A.length; i++) {
            maxSum += A[i];
        }

        Arrays.sort(A);

        return 0;
    }
}
