package Level1;

public class 카카오_다트게임 {
    public static void main(String[] args) {
        System.out.println(solution("1S2D*3T"));
    }

    public static int solution(String dartResult) {
        String[] list = dartResult.split("");
        int answer = 0;
        int[] answeranal = new int[3];
        int j =0;
        String num = "";
        for (int i = 0; i < list.length; i++) {


            try {
                int n = Integer.parseInt(list[i]);
                num += n;


            }
            catch (NumberFormatException e) {
                if (list[i].equals("S")) {
                    answeranal[j] = Integer.parseInt(num);
//                    System.out.println(answeranal[j]+ "확인");
                    j++;
                    num = "";
                }
                else if (list[i].equals("D")) {
                    answeranal[j] = (int)Math.pow(Integer.parseInt(num),2);
//                    System.out.println(answeranal[j]+ "확인");
                    j++;
                    num = "";
                }
                else if (list[i].equals("T")) {
                    answeranal[j] = (int)Math.pow(Integer.parseInt(num),3);
//                    System.out.println(answeranal[j]+ "확인");
                    j++;
                    num = "";
                }
                if (list[i].equals("*")) {
                    if (j==1){
                        int num1 = answeranal[j-1];
                        answeranal[j-1] = num1*2;
                    }
                    else {
                        int num1 = answeranal[j-2];
                        int num2 = answeranal[j-1];
                        answeranal[j-2] = num1*2;
                        answeranal[j-1] = num2*2;
                    }
                }
                else if (list[i].equals("#")) {
                    int num1 = answeranal[j-1];
                    answeranal[j-1] = num1*(-1);
                }
            }

        }
        for (int i : answeranal){
            answer += i;
//            System.out.println(i+ "확인2");

        }
        return answer;
    }
}
