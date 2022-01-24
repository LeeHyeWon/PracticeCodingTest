package lesson2;

import java.util.HashMap;
import java.util.jar.JarEntry;

public class OddOccurrencesInArray {

    /**
     * N개의 정수로 구성된 비어 있지 않은 배열 A가 제공됩니다.
     * 배열에는 홀수개의 요소가 포함되어 있으며, 배열의 각 요소는 짝을 이루지 않은 한 요소를 제외하고 동일한 값을 가진 다른 요소와 짝을 이룰 수 있습니다.
     * 예를 들어, 다음과 같은 배열 A에서:
     * <p>
     * A[0] = 9 A[1] = 3 A[2] = 9
     * A[3] = 3 A[4] = 9 A[5] = 7
     * A[6] = 9
     * 인덱스 0과 2에 있는 요소의 값은 9이고,
     * 인덱스 1과 3에 있는 요소의 값은 3이고,
     * 인덱스 4와 6에 있는 요소의 값은 9이고,
     * 인덱스 5의 요소는 값이 7이고 쌍을 이루지 않습니다.
     * 위의 조건을 충족하는 N개의 정수로 구성된 배열 A가 주어지면 짝을 이루지 않은 요소의 값을 반환합니다.
     * 예를 들어, 주어진 배열 A는 다음과 같습니다.
     * A[0] = 9 A[1] = 3 A[2] = 9
     * A[3] = 3 A[4] = 9 A[5] = 7
     * A[6] = 9
     * 함수는 위의 예에서 설명한 대로 7을 반환해야 합니다.
     * 다음 가정에 대한 효율적인 알고리즘을 작성하십시오.
     * N은 [1..1,000,000] 범위 내의 홀수 정수입니다.
     * 배열 A의 각 요소는 [1..1,000,000,000] 범위 내의 정수입니다.
     * A 의 값 중 하나를 제외한 모든 값이 짝수번 발생합니다.
     */
    public static void main(String[] args) {
        int[] A = {9, 3, 9, 3, 9, 9, 525252525};
        System.out.println(solution(A));
    }

    public static int solutionHash(int[] A) {
        int answer = 0;
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();

        for (int i = 0; i < A.length; i++) {
            map.computeIfPresent(A[i], (key, value) -> !value);
            map.putIfAbsent(A[i], false);
        }

        for (Integer key : map.keySet()) {
            boolean value = map.get(key);
            if (!value) {
                answer = key;
            }
        }

        return answer;
    }

    public static int solution(int[] A) {
        int answer = 0;
        for (int i = 0; i < A.length; i++) {
            answer = answer ^ A[i];
        }

        return answer;
    }

}
