package Level1;

public class 문자열내p와y의개수 {
    boolean solution(String s) {
        String[] str = s.split("");
        int pNum = 0;
        int yNum = 0;
        for (String i : str){
            if (i.equals("p") || i.equals("P")){
                pNum++;
            }
            else if (i.equals("y") || i.equals("Y")) {
                yNum++;
            }
        }
        boolean answer = false;
        if (pNum==yNum){
            answer = true;
        }
        return answer;
    }
}
