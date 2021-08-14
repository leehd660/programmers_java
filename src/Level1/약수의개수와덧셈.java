package Level1;

public class 약수의개수와덧셈 {
    public static void main(String[] args) {
        int a = 13;
        int b = 17;
        System.out.println(solution(a,b));
    }
    public static int solution(int left, int right) {
        int answer = 0;
        for (int i=left; i<right+1; i++){
            int num = 1;
            for (int j=1; j<(i/2)+1; j++){
                if (i%j == 0){
                    num++;
                }
            }
            if (num%2==0) {
                answer += i;
            }
            else answer -= i;
        }
        return answer;
    }
}
