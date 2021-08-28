package Level1;

import java.util.ArrayList;
import java.util.List;

public class 카카오_신규아이디추천new {
    public static void main(String[] args) {
        String str = "abcdefghijklmn.p";
        System.out.println(solution(str));
    }

    public static String solution(String new_id) {
        String answer = "";

        //1단계
        String str1 = step1_3(new_id);
        System.out.println(str1);
        List<String> strList = new ArrayList<>();
        for (int i=0; i<str1.length(); i++){
            strList.add(str1.substring(i,i+1));
        }
        if (strList.get(0).equals(".")){
            strList.remove(0);
        }
        if (strList.size()>=1 && strList.get(strList.size()-1).equals(".")){
            strList.remove(strList.size()-1);
        }
        if (strList.size()==0){
            strList.add("a");
        }
        if (strList.size()>=16){
            while(strList.size()>=16){
                strList.remove(strList.size()-1);
            }
        }
        if (strList.get(0).equals(".")){
            strList.remove(0);
        }
        if (strList.size()>=1 && strList.get(strList.size()-1).equals(".")){
            strList.remove(strList.size()-1);
        }
        if (strList.size()<=2){
            while (strList.size()<3){
                strList.add(strList.get(strList.size()-1));
            }
        }

        for (String s : strList){
            answer += s;
        }

        return answer;
    }

    public static String step1_3(String id) {
        String str ="";
        String[] strArr = id.split("");
        int pointNum = 0;
        for (int i=0; i<strArr.length; i++){
            try {
                int num = Integer.parseInt(strArr[i]);
                str += strArr[i];
                pointNum = 0;
            }
            catch (NumberFormatException e){
                if (id.charAt(i) == 45 || id.charAt(i) == 95) {
                    str += strArr[i];
                    pointNum = 0;
                }
                else if (id.charAt(i)>=65 && id.charAt(i)<=90){
                    strArr[i] = String.valueOf(Character.toLowerCase(id.charAt(i)));
                    str += strArr[i];
                    pointNum = 0;
                }
                else if (id.charAt(i)>=97 && id.charAt(i)<=122) {
                    str += strArr[i];
                    pointNum = 0;
                }
                if (id.charAt(i) == 46 && pointNum == 0) {
                    str += strArr[i];
                    pointNum =1;
                }
                else if (id.charAt(i) == 46 && pointNum ==1){
                    continue;
                }
            }
        }
        return str;
    }
}
