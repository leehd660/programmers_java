package Level1;

public class 카카오_비밀지도 {
    public static void main(String[] args) {
        int[]a={9,20,28,18,11};
        int[]b={30,1,21,17,28};
        System.out.println(solution(5,a,b));
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer1 = new String[n];
        String[] answer2 = new String[n];
        String[] answer1_1 = new String[n];
        String[] answer2_1 = new String[n];
        String[] answer = new String[n];

        for (int i=0; i<arr1.length; i++) {
            answer1[i] = Integer.toBinaryString(arr1[i]);
        }
        for (int i=0; i<arr2.length; i++) {
            answer2[i] = Integer.toBinaryString(arr2[i]);
        }

        for (int i=0; i<n; i++) {
            String str = "";
            String[] inNum = answer1[i].split("");
            if (inNum.length < n) {
                for (int k = 0; k < n - inNum.length; k++) {
                    str += " ";
                }
                for (String s:inNum){
                    if(s.equals("1")){
                        str += "#";
                    }
                    else {
                        str += " ";
                    }
                }

            }
            else {
                for (String s:inNum){
                    if(s.equals("1")){
                        str += "#";
                    }
                    else {
                        str += " ";
                    }
                }
            }
            answer1_1[i] += str;
            System.out.println("1번" + str);
        }
        for (int i=0; i<n; i++) {
            String str ="";
            String[] inNum = answer2[i].split("");
            if (inNum.length < n) {
                for (int k = 0; k < n - inNum.length; k++) {
                    str += " ";
                }
                for (String s:inNum){
                    if(s.equals("1")){
                        str += "#";
                    }
                    else {
                        str += " ";
                    }
                }

            }
            else {
                for (String s:inNum){
                    if(s.equals("1")){
                        str += "#";
                    }
                    else {
                        str += " ";
                    }
                }
            }
            answer2_1[i] += str;
            System.out.println("2번" + str);
        }

        for (int i=0; i<n; i++) {
            String answerStr = "";
            String[] inNum1 = answer1_1[i].split("");
            String[] inNum2 = answer2_1[i].split("");
//            System.out.println(answer1_1[0]+"확인:"+answer2_1[0]);

            for (int j=4;j<4+n;j++){

                if (inNum1[j].equals(" ") && inNum2[j].equals(" ")){
                    answerStr += " ";
                }
                else {answerStr += "#";}
            }
            answer[i] = answerStr;
            System.out.println("답"+answerStr);
        }

        return answer;
    }
}
