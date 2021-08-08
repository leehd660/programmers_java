package Level1;

public class 문자열다루기기본 {
    public static void main(String[] args) {
        String a = "123849Z";
        System.out.println(solution(a));
    }
    public static boolean solution(String s) {

        boolean answer = true;
        if (s.length()==4 || s.length()==6) {
            try {
                int n = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                answer = false;
            }
        }
        else answer = false;

        return answer;
    }
}
