package Level1;

import java.util.ArrayList;
import java.util.List;

public class 같은숫자는싫어 {
    public int[] solution(int []arr) {
        List<Integer> numlist = new ArrayList<>();
        numlist.add(arr[0]);
        for (int i = 1; i<arr.length; i++){
            if (arr[i-1]!=arr[i]){
                numlist.add(arr[i]);
            }
        }
        int[] answer = new int[numlist.size()];
        for (int i=0; i<numlist.size(); i++){
            answer[i]=numlist.get(i);
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
