package Level1;

import java.util.ArrayList;
import java.util.List;

public class 카카오_신규아이디추천 {
    public static String solution(String new_id) {
        String answer = "";
//        String[] strArr = new_id.split("");
//        List<String> strList = new ArrayList<>();
//        for (String s : strArr){
//            strList.add(s);
//        }
        //1단계
        String step1 = upperWord(new_id);
        String step2 = removeS(step1);
        String step3 = rule3(step2);

        String[] strArr = step3.split("");
        List<String> strList = new ArrayList<>();
        for (String s : strArr){
            strList.add(s);
        }

        //5단계 + 7단계
        if (strList.size() == 0){
            answer += "aaa";
        }

        //6단계
        else if (strArr.length>=16) {
            for (int i=0; i<15; i++){
                strList.remove(0);
            }
        }

        //7단계
        if (strList.size()<=2){

            answer += new_id;
            while (answer.length()>=3){
                answer += strArr[strArr.length-1];
            }
        }
        else {
            for (String s: strArr){
                answer+=s;
            }
        }

        return answer;
    }

    public static String upperWord(String id) {
        String str ="";
        String[] strArr = id.split("");
        for (int i=0; i<strArr.length; i++){
            if (id.charAt(i)>=65 && id.charAt(i)<=90){
                strArr[i] = Integer.toString((char)(id.charAt(i)+32));
            }
            str += strArr[i];
        }
        return str;
    }

    public static String removeS(String id) {
        //46 45 96
        String str = "";
        String[] strArr1 = id.split("");
        for (int i=0; i<id.length(); i++){
            try {
                int num = Integer.parseInt(strArr1[i]);
                str += strArr1[i];
            }
            catch (NumberFormatException e){
                if (id.charAt(i) == 45 || id.charAt(i) == 46 || id.charAt(i) == 96) {
                    str += strArr1[i];
                }
                else if (id.charAt(i)>=97 && id.charAt(i)<=122) {
                    str += strArr1[i];
                }
            }
        }
        return str;
    }

    public static String rule3(String id){
        String str ="";
        String[] strArr1 = id.split("");
        List<String> strArr = new ArrayList<>();
        for (int i=0; i<strArr1.length; i++) {
            if (i==0 && strArr1[i].equals(".")){
                continue;
            }
            else if (i==strArr1.length-1 && strArr1[i].equals(".")){
                continue;
            }
            else if (strArr1[i].equals(".") && strArr1[i + 1].equals(".")) {
//                strArr.add(strArr1[i]);
                str += strArr1[i];
                i++;
            } else {
//                strArr.add(strArr1[i]);
                str += strArr1[i];
            }
        }
//        if (strArr1[0].equals(".")){
//            strArr.remove(0);
//        }
//        else if (strArr1[strArr1.length-1].equals(".")){
//            strArr.remove(strArr.size()-1);
//        }
        return str;
    }
}
