package lesson1;

public class BinaryGap {
    /**
     * 양의 정수 N 내의 이진 간격은 N의 이진 표현에서 양쪽 끝에서 1로 둘러싸인 연속 0의 최대 시퀀스입니다.
     * 예를 들어, 숫자 9는 이진 표현 1001을 갖고 길이가 2인 이진 간격을 포함합니다.
     * 숫자 529는 이진 표현이 1000010001이고 두 개의 이진 간격(길이 4 중 하나와 길이 3 중 하나)을 포함합니다.
     * 숫자 20에는 이진 표현 10100이 있고 다음을 포함합니다.
     * 길이가 1인 하나의 이진 간격. 숫자 15는 이진 표현 1111을 가지며 이진 간격이 없습니다.
     * 숫자 32는 이진수 표현이 100000이고 이진수 간격이 없습니다.
     */
    public static void main(String[] args) {

        int answer = solution(12);

        System.out.println("answer = " + answer);

    }

    public static int solution(int N) {
        String binary = Integer.toBinaryString(N);
        char[] binaryArray = binary.toCharArray();

        int startIndex = 0;
        int count = 0;
        int answer = 0;
        for (int i = 1; i < binaryArray.length; i++) {
            if(binaryArray[i] == '1'){
                count = i - startIndex - 1;
//                System.out.println("count = " + count);
                if (count > answer) {
                    answer = count;
                }
                startIndex = i;
            }
        }
        return answer;
    }
}
