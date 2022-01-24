package lesson7;

import java.util.Stack;

public class StoneWall {
    /**
     * 돌담을 쌓게 됩니다. 벽은 직선이어야 하고 길이는 N미터여야 하며 두께는 일정해야 합니다.
     * 그러나 다른 위치에서 다른 높이를 가져야 합니다.
     * 벽의 높이는 N개의 양의 정수로 구성된 배열 H로 지정됩니다. H[I]는 I에서 왼쪽 끝의 오른쪽으로 I+1미터까지의 벽 높이입니다. 특히, H[0]은 벽의 왼쪽 끝의 높이이고 H[N-1]은 벽의 오른쪽 끝의 높이입니다.
     * 벽은 직육면체 석재 블록으로 지어야 합니다(즉, 이러한 블록의 모든면이 직사각형). 당신의 임무는 벽을 만드는 데 필요한 최소 블록 수를 계산하는 것입니다.
     * 함수 작성:
     * 클래스 솔루션 { 공개 int 솔루션(int[] H); }
     * 벽의 높이를 지정하는 N개의 양의 정수로 구성된 배열 H가 주어지면 벽을 만드는 데 필요한 최소 블록 수를 반환합니다.
     * 예를 들어, N = 9개의 정수를 포함하는 배열 H가 주어지면:
     *   H[0] = 8 H[1] = 8 H[2] = 5
     *   H[3] = 7 H[4] = 9 H[5] = 8
     *   H[6] = 7 H[7] = 4 H[8] = 8
     * 함수는 7을 반환해야 합니다. 그림은 7개 블록의 가능한 배열을 보여줍니다.
     * 그림 참조 https://app.codility.com/programmers/lessons/7-stacks_and_queues/stone_wall/
     * 다음 가정에 대한 효율적인 알고리즘을 작성하십시오.
     * N은 [1..100,000] 범위 내의 정수입니다.
     * 배열 H의 각 요소는 [1..1,000,000,000] 범위 내의 정수입니다.
     */

    public static void main(String[] args) {
        int[] H = {8, 8, 5, 7, 9, 8, 7, 4, 8};
        System.out.println("solution(H) = " + solution(H));
    }
    //문제 이해 필요. 코드는 안어려움.

    static int solution(int[] H) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < H.length; i++) {
            while(!stack.isEmpty() && stack.peek() > H[i]){
                stack.pop();
            }
            if (stack.isEmpty() || stack.peek() < H[i]) {
                stack.push(H[i]);
                answer++;
            }
        }
        return answer;
    }
}
