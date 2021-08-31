package Level2;

import java.util.Arrays;

public class 최솟값만들기 {
    public static void main(String[] args) {
        int[] a = {1,4,2};
        int[] b = {5,4,4};
        System.out.println(solution(a,b));
    }
    public static int solution(int []A, int []B) {
        int answer = 0;
//        for (int i=0; i<A.length-1; i++) {
//            for (int j=i+1; j<A.length; j++) {
//                //오름차순 정리
//                int big = A[i];
//                int small = A[j];
//                if (A[i]<A[j]){
//                    A[i] = small;
//                    A[j] = big;
//                }
//            }
//        }
//        for (int i=0; i<B.length-1; i++) {
//            for (int j=i+1; j<B.length; j++) {
//                //오름차순 정리
//                int big = B[i];
//                int small = B[j];
//                if (B[i]<B[j]){
//                    B[i] = small;
//                    B[j] = big;
//                }
//            }
//        }
        Arrays.sort(A);
        Arrays.sort(B);

        for (int i=0; i<A.length; i++) {
            answer += A[i]*B[B.length-1-i];
        }

        return answer;
    }
}
