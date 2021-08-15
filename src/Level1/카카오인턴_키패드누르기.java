package Level1;

public class 카카오인턴_키패드누르기 {
    public static void main(String[] args) {

    }
    public static String solution(int[] numbers, String hand) {
        String answer = "";
        int[][] numDis = {{3,2,1,0},
                {1,2,3,4},
                {0,1,2,3},
                {1,2,3,4},
                {2,1,2,3},
                {1,0,1,2},
                {2,1,2,3},
                {3,2,1,2},
                {2,1,0,1},
                {3,2,1,2},
                {4,3,2,1},
                {4,3,2,1}};
        int leftnum = 10;
        int righttnum = 11;
        for (int i=0; i< numbers.length; i++) {
            if (numbers[i]==3 || numbers[i]==6 || numbers[i]==9) {
                answer += "R";
                righttnum = numbers[i];
            }
            else if (numbers[i]==1 || numbers[i]==4 || numbers[i]==7){
                answer += "L";
                leftnum = numbers[i];
            }
            else {
                int n = 0;
                switch (numbers[i]){
                    case 2: n=0; break;
                    case 5: n=1; break;
                    case 8: n=2; break;
                    case 0: n=3; break;
                }
                if (numDis[leftnum][n]>numDis[righttnum][n]) {
                    answer += "R";
                    righttnum = numbers[i];
                }
                else if (numDis[leftnum][n]<numDis[righttnum][n]) {
                    answer += "L";
                    leftnum = numbers[i];
                }
                else if (numDis[leftnum][n]==numDis[righttnum][n]){
                    if (hand.equals("left")){
                        answer += "L";
                        leftnum = numbers[i];
                    }
                    else {answer += "R"; righttnum = numbers[i];}
                }
                System.out.println(leftnum +"gg"+righttnum);
            }
        }
        return answer;
    }
}
