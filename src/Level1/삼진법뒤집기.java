package Level1;

public class 삼진법뒤집기 {
    public static void main(String[] args) {
        System.out.println(solution(45));
    }
    public static int solution(int n) {
        int answer = 0;
        String num = "";
        while (true){
            if ((n/3)>0){
                num += n%3;
                n = n/3;
            }
            else {
                num += n;
                break;
            }
        }
        System.out.println(num);
        String[] strlist = num.split("");
        for (int i= 0; i< strlist.length; i++){
            int ans = Integer.parseInt(strlist[i]);
            answer += ans*Math.pow(3,(strlist.length-1)-i);
        }
        return answer;
    }
}
