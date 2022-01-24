package lesson4;

import java.util.Arrays;

public class PermCheck {
    /**
     * N개의 정수로 구성된 비어 있지 않은 배열 A가 제공됩니다.
     * 순열은 1에서 N까지의 각 요소를 한 번만 포함하는 시퀀스입니다.
     * 예를 들어 다음과 같은 배열 A:
     * A[0] = 4
     * A[1] = 1
     * A[2] = 3
     * A[3] = 2
     * 순열이지만 배열 A는 다음과 같습니다.
     * A[0] = 4
     * A[1] = 1
     * A[2] = 3
     * 값 2가 없기 때문에 순열이 아닙니다.
     * 목표는 배열 A가 순열인지 확인하는 것입니다.
     * 함수 작성:
     * 클래스 솔루션 { 공개 int 솔루션(int[] A); }
     * 배열 A가 주어지면 배열 A가 순열이면 1을 반환하고 그렇지 않으면 0을 반환합니다.
     * 예를 들어, 주어진 배열 A는 다음과 같습니다.
     * <p>
     * A[0] = 4
     * A[1] = 1
     * A[2] = 3
     * A[3] = 2
     * 함수는 1을 반환해야 합니다.
     * 주어진 배열 A는 다음과 같습니다.
     * A[0] = 4
     * A[1] = 1
     * A[2] = 3
     * 함수는 0을 반환해야 합니다.
     * 다음 가정에 대한 효율적인 알고리즘을 작성하십시오.
     * N은 [1..100,000] 범위 내의 정수입니다.
     * 배열 A의 각 요소는 [1..1,000,000,000] 범위 내의 정수입니다.
     */

    public static void main(String[] args) {
        int[] A = {4, 1, 3, 2};
        System.out.println("A = " + solution(A));
    }

    static int solution(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (A[i] != i + 1) {
                return 0;
            }
        }
        return 1;
    }
}
