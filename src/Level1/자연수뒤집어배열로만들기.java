package Level1;

public class 자연수뒤집어배열로만들기 {
    public static void main(String[] args) {
        System.out.println(solution(123456789));
    }

    public static int[] solution(long n) {
        String str = Long.toString(n);
        String[] numList = str.split("");
        int[] answer = new int[numList.length];
        for (int i= numList.length; i>0; i--){
            answer[numList.length-i] = Integer.parseInt(numList[i-1]);
        }
        return answer;
    }
}
