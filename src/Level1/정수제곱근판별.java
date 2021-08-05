package Level1;

public class 정수제곱근판별 {
    public static void main(String[] args) {

    }

    public long solution(long n) {
        if (Math.sqrt(n)%1>0){
            long answer = -1;
            return answer;
        }
        else {
            long answer = (long)Math.pow(Math.sqrt(n)+1,2);
            return answer;
        }
    }
}
