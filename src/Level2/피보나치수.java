package Level2;

public class 피보나치수 {
    public static void main(String[] args) {
        System.out.println(solution(99998));
    }
    public static long solution(long n) {
        long fNum = 0;
        long sNum = 1;
        long answer =1;
        for (long i=0; i<n-1; i++){
            long nNum = (fNum + sNum)%1234567;
            fNum = sNum;
            sNum = nNum;
        }

        answer = sNum;
        return answer;
    }
}
