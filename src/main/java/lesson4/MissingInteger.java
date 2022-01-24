package lesson4;

import java.awt.*;
import java.util.Arrays;
import java.util.HashSet;

public class MissingInteger {
    /**
     * 이것은 데모 작업입니다.
     * 함수 작성:
     * 클래스 솔루션 { 공개 int 솔루션(int[] A); }
     * 정수 N이 배열 A에 주어지면 A에서 발생하지 않는 가장 작은 양의 정수(0보다 큼)를 반환합니다.
     * 예를 들어 A = [1, 3, 6, 4, 1, 2]일 때 함수는 5를 반환해야 합니다.
     * A = [1, 2, 3]이 주어지면 함수는 4를 반환해야 합니다.
     * A = [−1, −3]이 주어지면 함수는 1을 반환해야 합니다.
     * 다음 가정에 대한 효율적인 알고리즘을 작성하십시오.
     * N은 [1..100,000] 범위 내의 정수입니다.
     * 배열 A의 각 요소는 [−1,000,000..1,000,000] 범위의 정수입니다.
     */

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        System.out.println("solution(A) = " + solution(A));
    }

    //HashSet으로 중복 제거 후, 1씩 증가하여 숫자가 있는 지 여부 확인.
    static int solution(int[] A) {
        HashSet<Integer> set = new HashSet<>();
        int answer = 1;
        for (int i : A) {
            set.add(i);
        }

        for (int i = 1; i <= set.size() + 1; i++) {
            if (!set.contains(i)) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}

