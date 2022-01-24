package lesson5;

public class CountDiv {
    /**
     * 클래스 솔루션 { 공개 int 솔루션(int A, int B, int K); }
     * 세 개의 정수 A, B 및 K가 주어지면 [A..B] 범위 내에서 K로 나눌 수 있는 정수의 수를 반환합니다. 즉:
     * { i : A ≤ i ≤ B, i mod K = 0 }
     * 예를 들어, A = 6, B = 11 및 K = 2의 경우 함수는 3을 반환해야 합니다. [6..11] 범위 내에서 2로 나눌 수 있는 3개의 숫자, 즉 6, 8 및 10이 있기 때문입니다.
     * 다음 가정에 대한 효율적인 알고리즘을 작성하십시오.
     * A 및 B는 [0..2,000,000,000] 범위 내의 정수입니다.
     * K는 [1..2,000,000,000] 범위의 정수입니다.
     * A ≤ B.
     */

    public static void main(String[] args) {
        int A = 6, B = 11, K = 7;
        System.out.println("solution(A, B, K) = " + solution(A, B, K));
    }
    //수식 기억 (B/K - A/K)
    static int solution(int A, int B, int K) {
        int answer = 0;
        if (A % K == 0) {
            answer = B / K - A / K + 1;
        } else {
            answer = B / K - A / K;
        }
        return answer;
    }
}
