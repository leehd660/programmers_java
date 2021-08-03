package Level1;

public class 콜라츠추측 {
    public static void main(String[] args) {
        long num = 626331;
        System.out.println(solution(num));
    }

    public static int solution(long num) {
        int answer = 0;
        while(num != 1){
            if (num%2 == 0){
                num = num/2;
                answer++;
            }
            else{
                num = (num*3)+1;
                answer++;
            }
            if (answer>500){
                answer = -1;
                break;
            }
        }
        return answer;
    }
}
