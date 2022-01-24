package lesson2;

public class CyclicRotation {
    /**
     * N개의 정수로 구성된 배열 A가 제공됩니다.
     * 배열의 회전은 각 요소가 한 인덱스만큼 오른쪽으로 이동하고 배열의 마지막 요소가 첫 번째 위치로 이동하는 것을 의미합니다.
     * 예를 들어 배열 A = [3, 8, 9, 7, 6]의 회전은 [6, 3, 8, 9, 7]입니다(요소는 한 인덱스 오른쪽으로 이동하고 6은 첫 번째 위치로 이동합니다).
     * 목표는 배열A 를 K 번 회전하는 것입니다. 즉, A의 각 요소는 오른쪽으로 K번 이동합니다.
     * N개의 정수와 정수 K로 구성된 배열 A가 주어지면 K번 회전한 배열 A를 반환합니다.
     */
    public static void main(String[] args) {
        int[] A = {};
        int K = 999;
        int[] answer = solution(A, K);
        for (int i : answer) {
            System.out.println("i = " + i);
        }

    }

    public static int[] solution(int[] A, int K) {
        int[] answer = new int[A.length];
        int N = A.length;

        if (N == 0) {
            return A;
        }

        if (K >= N && N > 0) {
            K %= N;
        }

        int index = 0;

        for (int i = A.length - K; i < A.length; i++) {
            answer[index++] = A[i];
        }

        for (int i = 0; i < A.length - K; i++) {
            answer[index++] = A[i];
        }
        return answer;
    }
}
