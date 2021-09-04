package Level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class 카카오_N진수게임 {
    public static void main(String[] args) {
        System.out.println(solution(16,16,2,1));
    }
    public static String solution(int n, int t, int m, int p) {
        String answer = "";
        int num = 0;
        List<String> findArr = new ArrayList<>();
        while (findArr.size()<p+(t-1)*m) {
            int compareNum = num;
//            String str ="";
//            while (true){
//                switch (compareNum%n){
//                    case 0 : str += 0; break;
//                    case 1 : str += 1; break;
//                    case 2 : str += 2; break;
//                    case 3 : str += 3; break;
//                    case 4 : str += 4; break;
//                    case 5 : str += 5; break;
//                    case 6 : str += 6; break;
//                    case 7 : str += 7; break;
//                    case 8 : str += 8; break;
//                    case 9 : str += 9; break;
//                    case 10 : str += "A"; break;
//                    case 11 : str += "B"; break;
//                    case 12 : str += "C"; break;
//                    case 13 : str += "D"; break;
//                    case 14 : str += "E"; break;
//                    case 15 : str += "F"; break;
//                }
//                compareNum = compareNum / n;
//                if (compareNum==0){
//                    break;
//                }
//                else if (compareNum<n){
//                    str += compareNum;
//                    break;
//                }
//            }
//            StringBuffer sb = new StringBuffer(str);
//            String realStr = sb.reverse().toString();
//            System.out.println(realStr+"gg");
//            for (String s: realStr.split("")){
//                findArr.add(s);
//            }
            String str = Integer.toString(num,n).toUpperCase(Locale.ROOT);
            System.out.println(str+"jj");
            for (String s : str.split("")) {
                findArr.add(s);
            }
            num++;
        }
        for (int i=p-1; i<p+(t-1)*m; i+=m){
            answer += findArr.get(i);
        }
        return answer;
    }
}
