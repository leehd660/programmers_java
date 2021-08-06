package Level1;

public class 자릿수더하기 {
    public long solution(long n) {
        String str = Long.toString(n);
        String[] strList = str.split("");
        long answer = 0;
        for (int i=0; i<strList.length; i++) {
            answer += Integer.parseInt(strList[i]);
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(answer);

        return answer;
    }
}
