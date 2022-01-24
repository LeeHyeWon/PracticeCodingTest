package lesson5;

import java.util.Arrays;
import java.util.HashSet;

public class GenomicRangeQuery {
    /**
     * DNA 서열은 A, C, G, T 문자로 구성된 문자열로 나타낼 수 있으며, 이는 서열의 연속적인 뉴클레오티드 유형에 해당합니다.
     * 각 뉴클레오티드에는 정수인 영향 계수가 있습니다.
     * 유형 A, C, G 및 T의 뉴클레오티드는 각각 1, 2, 3 및 4의 영향 계수를 갖습니다.
     * 다음과 같은 형식의 몇 가지 질문에 답할 것입니다.
     * 주어진 DNA 서열의 특정 부분에 포함된 뉴클레오티드의 최소 영향 인자는 무엇입니까?
     * DNA 시퀀스는 N개의 문자로 구성된 비어 있지 않은 문자열 S = S[0]S[1]...S[N-1]로 제공됩니다.
     * 비어 있지 않은 배열 P 및 Q에 제공되는 M 쿼리가 있으며 각각 M 정수로 구성되어 있습니다.
     * K 번째 쿼리(0 ≤ K < M)에서는 위치 P[K]와 Q[K](포함) 사이의 DNA 서열에 포함된 뉴클레오티드의 최소 영향 인자를 찾아야 합니다.
     * 예를 들어 다음과 같은 문자열 S = CAGCCTA와 배열 P, Q를 고려하십시오.
     * <p>
     * P[0] = 2 Q[0] = 4
     * P[1] = 5 Q[1] = 5
     * P[2] = 0 Q[2] = 6
     * 이러한 M = 3 쿼리에 대한 답변은 다음과 같습니다.
     * 위치 2와 4 사이의 DNA 부분에는 뉴클레오타이드 G와 C(두 번)가 포함되어 있으며, 이들의 임팩트 팩터는 각각 3과 2이므로 답은 2입니다.
     * 5번과 5번 위치 사이의 부분에는 단일 뉴클레오티드 T가 포함되어 있고 그 임팩트 팩터는 4이므로 답은 4입니다.
     * 위치 0과 6 사이의 부분(전체 문자열)은 모든 뉴클레오티드, 특히 영향 계수가 1인 뉴클레오티드 A를 포함하므로 답은 1입니다.
     * 함수 작성:
     * 클래스 솔루션 { 공개 int[] 솔루션(문자열 S, int[] P, int[] Q); }
     * N개의 문자로 구성된 비어 있지 않은 문자열 S와 M개의 정수로 구성된 두 개의 비어 있지 않은 배열 P 및 Q가 주어지면 모든 쿼리에 대한 연속적인 답변을 지정하는 M개의 정수로 구성된 배열을 반환합니다.
     * 결과 배열은 정수 배열로 반환되어야 합니다.
     * 예를 들어, 문자열 S = CAGCCTA와 배열 P, Q가 다음과 같은 경우:
     * P[0] = 2 Q[0] = 4
     * P[1] = 5 Q[1] = 5
     * P[2] = 0 Q[2] = 6
     * 함수는 위에서 설명한 대로 값 [2, 4, 1]을 반환해야 합니다.
     * 다음 가정에 대한 효율적인 알고리즘을 작성하십시오.
     * N은 [1..100,000] 범위 내의 정수입니다.
     * M은 [1..50,000] 범위 내의 정수입니다.
     * 배열 P 및 Q의 각 요소는 [0..N - 1] 범위 내의 정수입니다.
     * P[K] ≤ Q[K], 여기서 0 ≤ K < M;
     * 문자열 S는 대문자 A, C, G, T로만 구성됩니다.
     */
    public static void main(String[] args) {
        String S = "CAGCCTA";
        int[] P = {2, 5, 0};
        int[] Q = {4, 5, 6};
        solution(S, P, Q);
    }
    //테니스 다녀와서 원리 분석 다시
    static int[] solution(String S, int[] P, int[] Q) {
        int K = P.length;
        int[] answer = new int[K];
        char[] stringToChar = S.toCharArray();
        int[] A = new int[S.length()];
        int[] C = new int[S.length()];
        int[] G = new int[S.length()];
        int[] T = new int[S.length()];

        char c = S.charAt(0);

        if (c == 'A') {
            A[0]++;
        }
        else if (c == 'C') {
            C[0]++;
        }
        else if (c == 'G') {
            G[0]++;
        }
        else if (c == 'T') {
            T[0]++;
        }

        for (int i = 1; i < S.length(); i++) {
            switch (stringToChar[i]) {
                case 'A':
                    A[i] = A[i - 1] + 1;
                    C[i] = C[i - 1];
                    G[i] = G[i - 1];
                    T[i] = T[i - 1];
                    break;
                case 'C':
                    A[i] = A[i - 1];
                    C[i] = C[i - 1] + 1;
                    G[i] = G[i - 1];
                    T[i] = T[i - 1];
                    break;
                case 'G':
                    A[i] = A[i - 1];
                    C[i] = C[i - 1];
                    G[i] = G[i - 1] + 1;
                    T[i] = T[i - 1];
                    break;
                case 'T':
                    A[i] = A[i - 1];
                    C[i] = C[i - 1];
                    G[i] = G[i - 1];
                    T[i] = T[i - 1] + 1;
                    break;
            }
        }

        for (int i = 0; i < K; i++) {
            if (P[i] > 0) {
                if (A[P[i] - 1] < A[Q[i]]) {
                    answer[i] = 1;
                } else if (C[P[i] - 1] < C[Q[i]]) {
                    answer[i] = 2;
                } else if (G[P[i] - 1] < G[Q[i]]) {
                    answer[i] = 3;
                } else if (T[P[i] - 1] < T[Q[i]]) {
                    answer[i] = 4;
                }
            } else {
                if (A[Q[i]] > 0) {
                    answer[i] = 1;
                } else if (C[Q[i]] > 0) {
                    answer[i] = 2;
                } else if (G[Q[i]] > 0) {
                    answer[i] = 3;
                } else if (T[Q[i]] > 0) {
                    answer[i] = 4;
                }
            }
        }

        return answer;
    }
}
