package lesson3;

public class FromJmp {
    /**
     * 작은 개구리는 길 반대편으로 가고 싶어합니다. 개구리는 현재 위치 X에 있고 Y보다 크거나 같은 위치에 도달하려고 합니다. 작은 개구리는 항상 고정된 거리 D를 점프합니다.
     *
     * 작은 개구리가 목표물에 도달하기 위해 수행해야 하는 최소 점프 횟수를 세십시오.
     *
     * 함수 작성:
     *
     * 클래스 솔루션 { 공개 int 솔루션(int X, int Y, int D); }
     *
     * 세 개의 정수 X, Y 및 D가 주어지면 위치 X에서 Y보다 크거나 같은 위치로의 최소 점프 수를 반환합니다.
     *
     * 예를 들면 다음과 같습니다.
     *
     *   X = 10
     *   Y = 85
     *   D = 30
     * 개구리는 다음과 같이 위치하므로 함수는 3을 반환해야 합니다.
     *
     * 첫 번째 점프 후 위치 10 + 30 = 40
     * 두 번째 점프 후 위치 10 + 30 + 30 = 70
     * 세 번째 점프 후 위치 10 + 30 + 30 + 30 = 100
     * 다음 가정에 대한 효율적인 알고리즘을 작성하십시오.
     *
     * X, Y 및 D는 [1..1,000,000,000] 범위 내의 정수입니다.
     * X ≤ Y.
     */
    public static void main(String[] args) {
        System.out.println("solution(10, 85, 30) = " + solution(10, 90000000, 2));
    }

    public static int solution(int X, int Y, int D) {
        int distance = Y-X;
        if(distance <= 0) return 0;

        double jump = distance / (double) D;

        return (int) Math.ceil(jump);

    }
}
