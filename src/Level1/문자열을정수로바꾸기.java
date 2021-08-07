package Level1;

public class 문자열을정수로바꾸기 {
    public int solution(String s) {
        String[] str = s.split("");
        String answerList="";
        int answer = 0;
        if (str[0].equals("+")){
            for(int i=1; i<str.length; i++){
               answerList += str[i];
            }
            answer = Integer.parseInt(answerList);
        }
        else if (str[0].equals("-")){
            for(int i=1; i<str.length; i++){
                answerList += str[i];
            }
            answer = Integer.parseInt(answerList)*-1;
        }
        else {
            answer =Integer.parseInt(s);
        }
        return answer;
    }
}
