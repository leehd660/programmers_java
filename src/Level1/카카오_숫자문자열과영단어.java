package Level1;

public class 카카오_숫자문자열과영단어 {
    public int solution(String s) {
        int answer = 0;
        String[] strArr = s.split("");
        String answerNum = "";
        String numberWord ="";
        for (String word : strArr){
            try {
                int num = Integer.parseInt(word);
                answerNum += num;
            }
            catch (NumberFormatException e) {
                numberWord += word;
            }
            switch (numberWord){
                case "zero" : answerNum += 0; numberWord=""; break;
                case "one" : answerNum += 1; numberWord=""; break;
                case "two" : answerNum += 2; numberWord=""; break;
                case "three" : answerNum += 3; numberWord=""; break;
                case "four" : answerNum += 4; numberWord=""; break;
                case "five" : answerNum += 5; numberWord=""; break;
                case "six" : answerNum += 6; numberWord=""; break;
                case "seven" : answerNum += 7; numberWord=""; break;
                case "eight" : answerNum += 8; numberWord=""; break;
                case "nine" : answerNum += 9; numberWord=""; break;
            }
        }
        answer = Integer.parseInt(answerNum);
        return answer;
    }
}
