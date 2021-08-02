package Level1;

public class 체육복 {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {3};

        int ans = solution(n, lost, reserve);
    }


    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] total_list = new int[n];
        for (int i =0; i < n; i++){
            //잃어버리기 전 체육복의 수를 모두 리스트로 작성하기
            total_list[i] = 1;
            for (int j=0; j < reserve.length; j++){
                if (i==(reserve[j]-1)){
                    total_list[i]=2;
                }
            }
            System.out.println(total_list[i]);
        }
        System.out.println("다음");
        for (int i=0; i< lost.length; i++) {
            total_list[lost[i]-1]--;
        }
        for (int i=0; i< total_list.length; i++){
            System.out.print(total_list[i]);
        }
        System.out.println("다음");

        for (int i=0; i < total_list.length; i++){
            if (i == 0 && total_list[i]==2){
                if (total_list[i+1] == 0){
                    total_list[i]--;
                    total_list[i+1]++;
                }
            }
            else if (i== total_list.length-1 && total_list[i]==2){
                if (total_list[i-1] == 0){
                    total_list[i]--;
                    total_list[i-1]++;
                }
            }
            else if (total_list[i] == 2) {
                if (total_list[i-1] == 0){
                    total_list[i]--;
                    total_list[i-1]++;
                }
                else if (total_list[i+1] == 0){
                        total_list[i]--;
                        total_list[i+1]++;
                }
            }
        }
        for (int i = 0; i< total_list.length; i++){
            System.out.println(total_list[i]);
            if (total_list[i]>=1){
                answer++;
            }
        }

        System.out.println("answer is " + answer);
        return answer;
    }

}

