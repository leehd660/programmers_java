package Level1;

public class 소수만들기 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(solution(nums));
    }
    public static int solution(int[] nums) {
        int answer = 0;

        for (int i=0; i<nums.length-2; i++){
            for (int j=i+1; j<nums.length-1; j++){
                for (int k=j+1; k< nums.length; k++){
                    int count =0;
                    int findNum = nums[i]+nums[j]+nums[k];
                    System.out.println(findNum+"qck");
                    if (findNum%2 ==0){
                        continue;
                    }
                    for (int g = 3; g<=(findNum/2)+1; g+=2){
                        if (findNum%g==0){
                            count++;
                        }
                    }
                    if (count==0){
                        answer++;
                        System.out.println(findNum);
                    }
                }
            }
        }
        return answer;
    }
}
