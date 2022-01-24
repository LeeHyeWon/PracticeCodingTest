package lesson3;

public class PermMissingElem {
    /**
     * N개의 서로 다른 정수로 구성된 배열 A가 제공됩니다. 배열에는 [1..(N + 1)] 범위의 정수가 포함되어 있습니다. 즉, 정확히 하나의 요소가 누락되었습니다.
     *
     * 당신의 목표는 누락된 요소를 찾는 것입니다.
     *
     * 함수 작성:
     *
     * 클래스 솔루션 { 공개 int 솔루션(int[] A); }
     *
     * 배열 A가 주어지면 누락된 요소의 값을 반환합니다.
     *
     * 예를 들어, 주어진 배열 A는 다음과 같습니다.
     *
     *   A[0] = 2
     *   A[1] = 3
     *   A[2] = 1
     *   A[3] = 5
     * 함수는 누락된 요소이므로 4를 반환해야 합니다.
     *
     * 다음 가정에 대한 효율적인 알고리즘을 작성하십시오.
     *
     * N은 [0..100,000] 범위 내의 정수입니다.
     * A의 요소는 모두 별개입니다.
     * 배열 A의 각 요소는 [1..(N + 1)] 범위 내의 정수입니다.
     */
    public static void main(String[] args) {
        int[] A = {2, 3, 1, 5};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        int[] mask = new int[A.length + 2];
        int answer = 0;
        for (int i = 0; i < A.length ; i++) {
            mask[A[i]]++;
        }

        for (int i = 1; i < mask.length; i++) {
            if (mask[i] < 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}
