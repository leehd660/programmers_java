package Level1;

public class 이상한문제만들기 {
    public static void main(String[] args) {
        String s = "  lhud   ij";
        String answer = "";
        String[] word = s.split("");
        int num =0;
        for (String i:word){
            if (i.equals(" ")) {
                answer += i;
                num = 0;
                System.out.println(num);
            }
            else {
                if (num%2==0) {
                    answer += i.toUpperCase();
                    num++;
                    System.out.println(num);
                }
                else {
                    answer += i.toLowerCase();
                    num++;
                    System.out.println(num);
                }
            }
        }
    }

    public String solution(String s) {
        String answer = "";
        String[] word = s.split("");
        int num =0;
        for (int i=0; i< word.length; i++){
            if (word[i].equals(" ")) {
                answer += word[i];
                num = 0;
            }
            else {
                if (i==0){
                    answer += word[i].toUpperCase();
                    num++;
                }
                else if (num%2==0) {
                    answer += word[i].toUpperCase();
                    num++;
                }
                else {
                    answer += word[i].toLowerCase();
                    num++;
                }
            }
        }
        return answer;
    }
}
