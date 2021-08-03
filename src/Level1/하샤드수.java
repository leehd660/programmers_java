package Level1;

public class 하샤드수 {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(solution(num));
    }

    public static boolean solution(int x) {
        boolean answer = true;
        String numToStr = Integer.toString(x);;
        String[] num_list = numToStr.split("");
        int ans_num = 0;
        for (int i=0; i<num_list.length; i++){
            ans_num += Integer.parseInt(num_list[i]);
        }
        if (x%ans_num != 0){
            answer = false;
        }
        return answer;
    }
}
