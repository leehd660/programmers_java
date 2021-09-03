package Level2;

public class 다음큰숫자 {
    public static void main(String[] args) {
        System.out.println(solution1(78));
    }
    public static int solution(int n) {
        String strNum = Integer.toBinaryString(n);
        System.out.println(strNum);
        String[] binArr = strNum.split("");
        int countZero =0;
        int countOne =0;
        for (int i= binArr.length-1; i>=0; i--){
            if (i ==0){
                countOne++;
                countZero++;
                break;
            }
            else if (binArr[i].equals("0")) {
                countZero++;
                continue;
            }
            else if (binArr[i].equals("1") && binArr[i-1].equals("1")){
                countOne++;
                continue;
            }
            else if (binArr[i].equals("1") && (binArr[i-1].equals("0"))){
                binArr[i] = "0";
                binArr[i-1] = "1";
                break;
            }
        }
        String answerStr = "";
        if (binArr.length+1==countOne+countZero) {
            answerStr += "10";
            for (int i = 0; i < countZero-1; i++) {
                answerStr += "0";
            }
            for (int i = 0; i < countOne-1; i++) {
                answerStr += "1";
            }
        }
        else {
            for (int i = 0; i < binArr.length - (countOne + countZero); i++) {
                answerStr += binArr[i];
            }
            for (int i = 0; i < countZero; i++) {
                answerStr += "0";
            }
            for (int i = 0; i < countOne; i++) {
                answerStr += "1";
            }
        }
        System.out.println(answerStr);
        int answer = Integer.valueOf(answerStr,2);
        return answer;
    }

////////////////////////////////////////////////////
    public static int solution1(int n) {
        int answer = 0;
        String strNum = Integer.toBinaryString(n);
        int count = strNum.length() - strNum.replace(String.valueOf("1"), "").length();
//        for (String s : strNum.split("")) {
//            if (s.equals("1")){
//                count++;
//            }
//        }
        int num = n+1;
        while(true){
            String str = Integer.toBinaryString(num);
//            int newCount =0;
            int newCount = str.length() - str.replace(String.valueOf("1"), "").length();

//            for (String s: Integer.toBinaryString(num).split("")){
//                if (s.equals("1")){
//                    newCount++;
//                }
//            }
            if (newCount == count) {
                answer = num;
                break;
            }
            num++;
        }
        return answer;
    }
}
