package Level1;

public class 두정수사이의합 {
    public long solution(int a, int b) {
        long answer = 0;
        int small =0;
        int big =0;
        if (a>=b){
            small = b;
            big = a;
        }
        else {
            small = a;
            big =b;
        }
        while(true){
            answer += small;
            if (small == big){
                break;
            }
            small++;
        }

        return answer;
    }
}
