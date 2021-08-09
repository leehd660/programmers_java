package Level1;

public class 문자열내림차순으로배치하기 {
    public static void main(String[] args) {
        System.out.println(solution("aofnek"));
    }
    public static String solution(String s) {
        String[] str = s.split("");
        int[] list =new int[str.length];
        for (int i=0; i<str.length; i++){
            list[i]=(int)(str[i].charAt(0));
        }
        for (int i =0; i< list.length; i++){
            for (int j=i+1; j<list.length; j++){
                int a = list[i];
                int b = list[j];
                if (a<b){
                    list[i] = b;
                    list[j] = a;
                }
            }
        }
        String answer = "";
        for (int i=0; i<list.length; i++){
            answer += (char)list[i];
        }

        return answer;
    }
}
