package Level2;

public class 숫자의표현 {
    public int solution(int n) {
        int answer = 1;
        for (int i=1; i<n/2; i++){
            if (n%i==0 && (n/i)%2 ==1){
                answer ++;
            }
        }
        return answer;
    }
}
