package Level1;

public class 가운데글자가져오기 {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        if (str.length%2==0){
            int num = str.length/2;
            answer = str[num-1]+str[num];
        }
        else {
            int num = (str.length/2);
            answer = str[num];
        }
        return answer;
    }
}
