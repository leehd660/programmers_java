package Level1;

public class 최대공약수최소공배수 {
    public static void main(String[] args) {
        int a=3;
        int b=12;
        System.out.println(solution(a,b));
    }

    public static long[] solution(long n, long m) {
        long min = 1;
        for (long num=2; num<=n && num<=m; num++){
            if (n%num==0 && m%num==0) {
                min = num;
            }
        }
        long max = min*(n/min)*(m/min);

        long[] answer = {min,max};
        return answer;
    }
}
