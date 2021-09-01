package Level2;

import java.util.Arrays;

public class 최댓값과최솟값 {
    public static void main(String[] args) {
        System.out.println(solution("1 2 3 4"));
    }
    public static String solution(String s) {
        String answer = "";
        String[] strArr = s.split(" ");
        int[] numArr = new int[strArr.length];
//        Arrays.sort(strArr);
        for (int i =0; i< strArr.length; i++){
            numArr[i]=Integer.parseInt(strArr[i]);
            System.out.println(numArr[i]);
        }
        Arrays.sort(numArr);
        answer = numArr[0] + " " + numArr[numArr.length-1];
        return answer;
    }
}
