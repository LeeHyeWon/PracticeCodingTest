package lesson11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountNonDivisible {
    /**
     * N개의 정수로 구성된 배열 A가 주어집니다.
     *
     * 0 ≤ i < N인 각 숫자 A[i]에 대해 A[i]의 제수가 아닌 배열 요소의 수를 계산하려고 합니다. 우리는 이러한 요소가 비약수라고 말합니다.
     *
     * 예를 들어, 다음과 같은 정수 N = 5와 배열 A를 고려하십시오.
     *
     *     A[0] = 3
     *     A[1] = 1
     *     A[2] = 2
     *     A[3] = 3
     *     A[4] = 6
     * 다음 요소의 경우:
     *
     * A[0] = 3, 비약수: 2, 6,
     * A[1] = 1, 비약수: 3, 2, 3, 6,
     * A[2] = 2, 비약수: 3, 3, 6,
     * A[3] = 3, 비약수: 2, 6,
     * A[4] = 6, 비약수가 없습니다.
     * 함수 작성:
     *
     * 클래스 솔루션 { 공개 int[] 솔루션(int[] A); }
     *
     * N개의 정수로 구성된 배열 A가 주어지면 비약수의 양을 나타내는 정수 시퀀스를 반환합니다.
     *
     * 결과 배열은 정수 배열로 반환되어야 합니다.
     *
     * 예를 들면 다음과 같습니다.
     *
     *     A[0] = 3
     *     A[1] = 1
     *     A[2] = 2
     *     A[3] = 3
     *     A[4] = 6
     * 함수는 위에서 설명한 대로 [2, 4, 3, 2, 0]을 반환해야 합니다.
     *
     * 다음 가정에 대한 효율적인 알고리즘을 작성하십시오.
     *
     * N은 [1..50,000] 범위 내의 정수입니다.
     * 배열 A의 각 요소는 [1..2 * N] 범위 내의 정수입니다.
     */

    public static void main(String[] args) {
        int[] A = {3, 1, 2, 3, 6};
        System.out.println("solution(A) = " + solution(A));
    }
    //1. 약수 구하기
    //2. 약수 저장
    //3. 약수 비교
    //4. 비교해서 비약수 개수 count
    //5. 비약수 count 배열 저장
    static int[] solution(int[] A) {
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        int[] answerArray = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            map.put(i, new ArrayList<>());
            for (int j = 1; j <= Math.sqrt(A[i]); j++) {
                if (A[i] % j == 0) { //약수 구하기
                    map.get(i).add(j);
                    map.get(i).add(A[i] / j); //약수 저장
                }
            }
        }

        for (Integer index : map.keySet()) {
            ArrayList<Integer> divisibleArray = map.get(index);
            for (int i = 0; i < A.length; i++) {
                if (!divisibleArray.contains(A[i])) {
                    answerArray[index]++;
                }
            }
        }

        return answerArray;
    }
}
