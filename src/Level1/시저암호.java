package Level1;

public class 시저암호 {
    public String solution(String s, int n) {
        String[] str = s.split("");
        String answer = "";
        for (String i:str){
            int num = i.charAt(0);
            if (i.equals(" ")){
                answer += i;
            }
            else if (num>=65 && num<=90){
                if (num+n>90){
                    answer+=(char)(num+n-26);
                }
                else {
                    answer += (char)(num+n);
                }
            }
            else if (num>=97 && num<=122){
                if (num+n>122){
                    answer+=(char)(num+n-26);
                }
                else {
                    answer += (char)(num+n);
                }
            }
        }
        return answer;
    }
}
