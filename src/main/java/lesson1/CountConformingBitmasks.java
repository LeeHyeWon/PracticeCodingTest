package lesson1;

public class CountConformingBitmasks {
    /**
     * 이 문제에서 우리는 부호 없는 30비트 정수, 즉 0 ≤ B < 2^30인 모든 정수 B를 고려합니다.
     * B의 비트가 1로 설정된 모든 위치에서 A가 해당 비트를 1로 설정하면 정수 A가 정수 B를 준수한다고 말합니다.
     * 3개의 부호 없는 30비트 정수 A, B, C가 주어지면 주어진 정수 중 적어도 하나를 따르는 부호 없는 30비트 정수의 수를 반환합니다
     * 함수는 A, B 또는 C를 준수하는 8개의 부호 없는 30비트 정수가 있으므로 8을 반환해야 합니다.
     */
    public static void main(String[] args) {

        int answer = solution(1073741727, 1073741631, 1073741679);

        System.out.println("answer = " + answer);

    }

    public static int solution(int A, int B, int C) {

        int answer = 0;
        int bitCountA = Integer.bitCount(A);
        int bitCountB = Integer.bitCount(B);
        int bitCountC = Integer.bitCount(C);

        String binaryA = Integer.toBinaryString(A);
        int maskSizeA = binaryA.length() - bitCountA;
        int[] indexA = new int[maskSizeA];

        int j = 0;

        for (int i = 0; i < binaryA.length(); i++) {
            if ((A & (1 << i)) == 0) {
                indexA[j++] = i;
            }
        }

        for (int i : indexA) {
            System.out.println("i = " + i);
        }

        int[] binaryArray = new int[(int) Math.pow(2, maskSizeA)];
        int[] maskArray = new int[(int) Math.pow(2, maskSizeA)];
        for (int i = 0; i < binaryArray.length; i++) {
            binaryArray[i] = i + 1;
        }

        for (int i : binaryArray) {
            System.out.println("i = " + i);
        }

        int z = 0;
        for (int i = 0; i < indexA.length; i++) {
            for (int k = i * 2; k <= i * 2 + 1; k++) {
                if (binaryArray[k] % 2 == 0) {
                    maskArray[z] = (1 << indexA[i]);
                } else {
                    maskArray[z] = maskArray[z-1] + (1 << indexA[i]);
                }
                z++;
            }

        }

        for (int i : maskArray) {
            System.out.println("i = " + i);
        }

//        for (int i : maskArray) {
//            System.out.println("i = " + i);
//        }

        return answer;

//        for(int i = B ; i <= 1073741823 ; i++){
//            if ((A & i) == A || (B & i) == B || (C & i) == C) {
//                System.out.println("i = " + i);
//                answer++;
//            }
//        }
    }
}
