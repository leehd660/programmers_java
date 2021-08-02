package Level1;

public class x만큼간격있는n개숫자 {
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        long[] ans = solution(x,n);
        System.out.println(ans);
    }
    public static long[] solution(long x, int n) {
        long[] answer = new long[n];

        for(int i=0; i<n; i++){
            answer[i] = (i+1)*x;
        }
        return answer;
    }
}
