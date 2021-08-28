package Level1;

public class 로또의최고순위와최저순위 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0,0};
        int countNum = 0;
        int countZero = 0;
        for (int i=0; i<lottos.length; i++) {
            if (lottos[i]==0){
                countZero++;
            }
            for (int j=0; j< win_nums.length; j++){
                if (lottos[i] == win_nums[j]){
                    countNum++;
                }
            }
        }
        if (countNum+countZero>=6){
            answer[0]=1;
        }
        else if (countNum+countZero==0){
            answer[0]=6;
        }
        else{
            answer[0]=7-(countNum+countZero);
        }
        if (countNum==0){
            answer[1]=6;
        }
        else{
            answer[1]= 7-(countNum);
        }

        return answer;
    }
}
