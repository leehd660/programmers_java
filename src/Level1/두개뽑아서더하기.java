package Level1;

import java.util.ArrayList;
import java.util.List;

public class 두개뽑아서더하기 {
    public static void main(String[] args) {
        int[] n ={2,1,3,4,1};
        System.out.println(solution(n));
    }
    public static int[] solution(int[] numbers) {
        List<Integer> sumlist = new ArrayList<>();
        for (int i=0; i< numbers.length-1; i++){
            for (int j=i+1; j< numbers.length; j++){
                int sum = numbers[i]+numbers[j];
                int count = 0;
                for (Integer num : sumlist){
                    System.out.println(sum);
                    if (num==sum){
                        break;
                    }
                    else count++;
                }
                if (count==sumlist.size()){
                    sumlist.add(sum);
                }
            }
        }
        int[] answer = new int[sumlist.size()];
        for(int i=0; i<sumlist.size(); i++){
            answer[i] = sumlist.get(i);
        }
        for (int i=0; i< answer.length-1; i++) {
            for (int j=i+1; j< answer.length; j++){
                int num1 = answer[i];
                int num2 = answer[j];
                if (num1 > num2){
                    answer[i] = num2;
                    answer[j] = num1;
                }
            }
        }
        return answer;
    }
}
