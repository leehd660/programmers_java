package Level2;

public class 올바른괄호 {
    boolean solution(String s) {
        //개수가 같아도 틀릴 수 있음 >수정해야함
        boolean answer = true;
        String[] testArr = s.split("");
        int count1 = 0;
        int count2 = 0;
        for (int i=0; i< testArr.length; i++) {
            if (i ==0 && testArr[i].equals(")")){
                answer = false;
                count2++;
                break;
            }
            else if (testArr[i].equals("(")){
                count1++;
            }
            else if (testArr[i].equals(")")){
                count2++;
            }
            if (i ==testArr.length-1 && testArr[i].equals("(")){
                count1 = 0;
                answer = false;
                break;
            }
        }
        if (count1!=count2){
            answer = false;
        }

        return answer;
    }

    boolean solution1(String s) {
        boolean answer = true;
        int count1 =0;
        int count2 =0;
        for (int i = 0; i<s.length(); i++){
            if (s.charAt(i)=='('){
                count1++;
            }
            else {
                count2++;
            }
            if (count1<count2){
                answer = false;
                break;
            }
        }
        if (count1!=count2){
            answer = false;
        }

        return answer;
    }
}
