package Level1;

public class 위클리이주차 {
    public String solution(int[][] scores) {
        String answer = "";
        for (int i=0; i< scores.length; i++){
            int totalScore =0;
            double meanScore = 0;
            int selfScore = scores[i][i];
            int maxScore = selfScore;
            int minScore = selfScore;
            int selfCount = -1;
            for (int j=0; j<scores[i].length; j++){
                totalScore += scores[j][i];
                if (scores[j][i]>selfScore){
                    maxScore = scores[j][i];
                }
                else if (scores[j][i]<selfScore){
                    minScore = scores[j][i];
                }
                else {
                    selfCount++;
                }
            }

            if ((selfScore == maxScore || selfScore ==minScore) && selfCount==0){
                meanScore = (double)(totalScore-selfScore)/(scores.length-1);
            }
            else {
                meanScore = totalScore/scores.length;
            }

            if (meanScore >= 90){
                answer += "A";
            }
            else if (meanScore >= 80){
                answer += "B";
            }
            else if (meanScore >= 70){
                answer += "C";
            }
            else if (meanScore >= 50){
                answer += "D";
            }
            else {
                answer += "F";
            }
        }
        return answer;
    }
}
