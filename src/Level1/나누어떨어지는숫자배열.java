package Level1;

import java.util.ArrayList;
import java.util.List;

public class 나누어떨어지는숫자배열 {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> numlist = new ArrayList<>();
        for (int i=0; i<arr.length; i++) {
            if (arr[i]%divisor ==0) {
                numlist.add(arr[i]);
            }
        }
        if (numlist.size()==0){
            numlist.add(-1);
        }
        int[] answer = new int[numlist.size()];
        for (int i=0; i< answer.length; i++) {
            answer[i] = numlist.get(i);
        }
        for (int i =0; i< answer.length-1; i++) {
            for (int j=i+1; j< answer.length; j++){
                int num1 = answer[i];
                int num2 = answer[j];
                if (num1>num2){
                    answer[i] = num2;
                    answer[j] = num1;
                }
            }
        }

        return answer;
    }
}
