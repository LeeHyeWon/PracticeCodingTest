package lesson6;

import java.util.HashSet;

public class Distinct {
    /**
     * N개의 정수로 구성된 배열 A가 주어지면 배열 A에 있는 고유한 값의 수를 반환합니다.
     * 예를 들어, 주어진 배열 A는 다음과 같은 6개의 요소로 구성됩니다.
     *  A[0] = 2 A[1] = 1 A[2] = 1
     *  A[3] = 2 A[4] = 3 A[5] = 1
     * 배열 A에 1, 2, 3이라는 3개의 고유한 값이 나타나기 때문에 함수는 3을 반환해야 합니다.
     * 다음 가정에 대한 효율적인 알고리즘을 작성하십시오.
     * N은 [0..100,000] 범위 내의 정수입니다.
     * 배열 A의 각 요소는 [−1,000,000..1,000,000] 범위의 정수입니다.
     */
    public static void main(String[] args) {
        int[] A = {2, 1, 1, 2, 3, 1};
        System.out.println("solution(A) = " + solution(A));
    }

    static int solution(int[] A) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : A) {
            set.add(i);
        }

        return set.size();
    }
}
