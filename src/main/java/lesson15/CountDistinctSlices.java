package lesson15;

public class CountDistinctSlices {
    /**
     * 정수 M과 N개의 음이 아닌 정수로 구성된 비어 있지 않은 배열 A가 제공됩니다. 배열 A의 모든 정수는 M보다 작거나 같습니다.
     *
     * 0 ≤ P ≤ Q < N과 같은 한 쌍의 정수(P, Q)를 배열 A의 슬라이스라고 합니다. 슬라이스는 요소 A[P], A[P + 1], ..., 답. 고유 슬라이스는 고유한 숫자로만 구성된 슬라이스입니다.
     *
     * 즉, 슬라이스에서 개별 번호가 두 번 이상 발생하지 않습니다.
     *
     * 예를 들어, 다음과 같은 정수 M = 6과 배열 A를 고려하십시오.
     *
     *     A[0] = 3
     *     A[1] = 4
     *     A[2] = 5
     *     A[3] = 5
     *     A[4] = 2
     * 정확히 9개의 별개의 조각이 있습니다: (0, 0), (0, 1), (0, 2), (1, 1), (1, 2), (2, 2), (3, 3), ( 3, 4) 및 (4, 4).
     *
     * 목표는 고유한 조각의 수를 계산하는 것입니다.
     *
     * 함수 작성:
     *
     * 클래스 솔루션 { 공개 int 솔루션(int M, int[] A); }
     *
     * 정수 M과 N 정수로 구성된 비어 있지 않은 배열 A가 주어지면 고유한 슬라이스 수를 반환합니다.
     *
     * 고유 슬라이스 수가 1,000,000,000보다 크면 함수는 1,000,000,000을 반환해야 합니다.
     *
     * 예를 들어, 주어진 정수 M = 6과 배열 A는 다음과 같습니다.
     *
     *     A[0] = 3
     *     A[1] = 4
     *     A[2] = 5
     *     A[3] = 5
     *     A[4] = 2
     *
     * 함수는 위에서 설명한 대로 9를 반환해야 합니다.
     *
     * 다음 가정에 대한 효율적인 알고리즘을 작성하십시오.
     *
     * N은 [1..100,000] 범위 내의 정수입니다.
     * M은 [0..100,000] 범위 내의 정수입니다.
     * 배열 A의 각 요소는 [0..M] 범위 내의 정수입니다.
     */

    public static void main(String[] args) {
        int M = 6;
        int[] A = {3, 4, 5, 5, 2};
        System.out.println("solution(M, A) = " + solution(M, A));
    }
    //공부 필요
    public static int solution(int M, int[] A) {
        boolean[] checked = new boolean[M + 1];
        int slices = 0;
        int right = 0;
        for (int left = 0; left < A.length; left++) {
            while (right < A.length && !checked[A[right]]) {
                slices += (right - left + 1);
                checked[A[right]] = true;
                right++;

                if (slices >= 1000000000) {
                    return 1000000000;
                }
            }

            checked[A[left]] = false;

            if (slices >= 1000000000) {
                return 1000000000;
            }
        }


        return slices;
    }
}
