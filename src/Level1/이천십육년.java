package Level1;

public class 이천십육년 {
    public static void main(String[] args) {
        System.out.println(solution(5,24));
    }
    public static String solution(int a, int b) {
        int day = 0;
        String answer = "";
        for (int i=1; i<a; i++) {
            if (i==1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10) {
                day += 31;
            } else if (i == 2) {
                day += 29;
            } else {
                day += 30;
            }
            System.out.println(day);
        }
        day+=(b-1);
        int num = day%7;
        switch (num) {
            case 0: answer="FRI";
                break;
            case 1: answer="SAT";
                break;
            case 2: answer="SUN";
                break;
            case 3: answer="MON";
                break;
            case 4: answer="TUE";
                break;
            case 5: answer="WED";
                break;
            case 6: answer="THU";
                break;
        }
        return answer;
    }
}
