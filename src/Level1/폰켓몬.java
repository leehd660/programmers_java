package Level1;

import java.util.ArrayList;
import java.util.List;

public class 폰켓몬 {
    public int solution(int[] nums) {
        int answer = 0;
        List<Integer> monsterNum = new ArrayList<>();
        int wantNum = nums.length/2;
        for (int i=0; i<nums.length; i++){
            int count =0;
            for (int j : monsterNum){
                if (j !=nums[i]){
                    count++;
                }
            }
            if (count==monsterNum.size()){
                monsterNum.add(nums[i]);
            }
            if (monsterNum.size()>=wantNum){
                break;
            }
        }
        answer = monsterNum.size();
        return answer;
    }
}
