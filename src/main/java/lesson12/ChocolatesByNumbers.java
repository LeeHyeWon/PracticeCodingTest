package lesson12;

public class ChocolatesByNumbers {
    /**
     * 두 개의 양의 정수 N과 M이 주어집니다. 정수 N은 0에서 N - 1까지 번호가 매겨진 원 안에 배열된 초콜릿의 수를 나타냅니다.
     *
     * 초콜릿을 먹기 시작합니다. 초콜릿을 먹고 나면 포장만 남습니다.
     *
     * 초콜릿 번호 0부터 먹기 시작합니다. 그런 다음 원에 있는 다음 M − 1 초콜릿이나 포장지를 생략하고 다음 것을 먹습니다.
     *
     * 더 정확하게 말하면, 초콜릿 숫자 X를 먹었다면 다음에는 숫자 (X + M) 모듈로 N(나누기의 나머지)의 초콜릿을 먹게 될 것입니다.
     *
     * 빈 포장지를 만나면 식사를 중단합니다.
     *
     * 예를 들어, 주어진 정수 N = 10 및 M = 4. 다음 초콜릿을 먹게 될 것입니다: 0, 4, 8, 2, 6.
     *
     * 목표는 위의 규칙에 따라 먹을 초콜릿의 수를 계산하는 것입니다.
     *
     * 함수 작성:
     *
     * 클래스 솔루션 { 공개 int 솔루션(int N, int M); }
     *
     * 두 개의 양의 정수 N과 M이 주어지면 먹을 초콜릿의 수를 반환합니다.
     *
     * 예를 들어, 주어진 정수 N = 10 및 M = 4. 위에서 설명한 대로 함수는 5를 반환해야 합니다.
     *
     * 다음 가정에 대한 효율적인 알고리즘을 작성하십시오.
     *
     * N 및 M은 [1..1,000,000,000] 범위 내의 정수입니다.
     */

    public static void main(String[] args) {
        int N = 10;
        int M = 4;
        System.out.println("solution(N, M) = " + solution(N, M));
    }
    //유클리드 호제법 -> 재귀 활용
    static int solution(int N, int M) {
        int answer = N / gcd(N, M);
        return answer;
    }

    static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }

}
