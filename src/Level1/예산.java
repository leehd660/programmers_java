package Level1;

public class 예산 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        for(int i=0; i<d.length-1; i++){
            for (int j=i+1; j<d.length; j++){
                int num1 = d[i];
                int num2 = d[j];
                if (d[i]>d[j]) {
                    d[i] = num2;
                    d[j] = num1;
                }
            }
        }
        int a = budget;
        for (int i=0; i<d.length; i++){
            if (d[i]<=a){
                answer++;
                a -= d[i];
            }
            else break;
        }
        return answer;
    }
}
