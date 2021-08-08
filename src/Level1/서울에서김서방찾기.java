package Level1;

public class 서울에서김서방찾기 {
    public String solution(String[] seoul) {
        int num =0;
        for (String i : seoul){
            if (i.equals("Kim")){
                break;
            }
            num++;
        }
        String answer = "김서방은 "+ num+ "에 있다";
        return answer;
    }
}
