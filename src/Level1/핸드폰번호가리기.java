package Level1;

public class 핸드폰번호가리기 {
    public static void main(String[] args) {
        String num ="01033334444";
        System.out.println(solution(num));
    }

    public static String solution(String phone_number) {
        String answer = "";
        String[] num = phone_number.split("");
        for (int i=0; i<num.length; i++) {
            if (i < num.length-4){
                answer += "*";
            }
            else {
                answer += num[i];
            }
        }
        return answer;
    }
}
