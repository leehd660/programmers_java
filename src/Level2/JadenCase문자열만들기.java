package Level2;

import java.util.Locale;

public class JadenCase문자열만들기 {
    public String solution(String s) {
        String answer = "";
        String[] strArr = s.split(" ");
        for (int i=0; i<strArr.length; i++){
            String[] wordArr = strArr[i].split("");
            for (int j=0; j<wordArr.length; j++){
                if (j==0){
                    answer += wordArr[j].toUpperCase(Locale.ROOT);
                }
                else {
                    answer += wordArr[j].toLowerCase(Locale.ROOT);
                }
            }
            if (i != strArr.length-1) {
                answer += " ";
            }
        }
        return answer;
    }

    public String solution1(String s) {
        String answer = "";
        int ruleNum =0;
        for (String eng : s.split("")){
            if (eng.equals(" ")){
                answer += eng;
                ruleNum = 0;
            }
            else if (ruleNum == 0){
                answer += eng.toUpperCase(Locale.ROOT);
                ruleNum = 1;
            }
            else if (ruleNum != 0){
                answer += eng.toLowerCase(Locale.ROOT);
            }
        }
        return answer;
    }
}
