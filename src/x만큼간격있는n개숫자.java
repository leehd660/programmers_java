

public class x만큼간격있는n개숫자 {
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        long[] ans = solution(x,n);
        System.out.println(ans);
    }
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int i=1; i<n+1; i++){
            answer[i-1] = i*x;
        }
        return answer;
    }
}
