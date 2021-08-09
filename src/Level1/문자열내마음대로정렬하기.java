package Level1;

public class 문자열내마음대로정렬하기 {
    public static void main(String[] args) {
        String[] str = {"ab","abc","abae"};
        System.out.println(solution(str,1));
    }
    public static String[] solution(String[] strings, int n) {
//        String[] strIndex = new String[strings.length];
        for (int i = 0; i< strings.length-1; i++){
            for (int k = i+1; k < strings.length; k++){
                String firstSt = strings[i];
                String secondSt = strings[k];
                int firstNum = (int)(strings[i].substring(n,n+1).charAt(0));
                int secondNum = (int)(strings[k].substring(n,n+1).charAt(0));
                if (firstNum>secondNum){
                    strings[i] = secondSt;
                    strings[k] = firstSt;
                }
                else if (firstNum == secondNum){
                    if (firstSt.length() >= secondSt.length()) {
                        int count =0;
                        for (int j = 0; j < secondSt.length(); j++) {
                            if ((int)(strings[i].substring(j,j+1).charAt(0)) > (int)(strings[k].substring(j,j+1).charAt(0))) {
                                strings[i] = secondSt;
                                strings[k] = firstSt;
                                break;
                            }
                            else if ((int)(strings[i].substring(j,j+1).charAt(0)) < (int)(strings[k].substring(j,j+1).charAt(0))){
                                break;
                            }
                            count++;
                        }
                        if (count==secondSt.length()){
                            strings[i] = secondSt;
                            strings[k] = firstSt;
                        }
                    }
                    else {
//                        int count=0;
                        for (int j = 0; j < firstSt.length(); j++) {

                            if (strings[i].substring(j,j+1).charAt(0) > strings[k].substring(j,j+1).charAt(0)) {
                                strings[i] = secondSt;
                                strings[k] = firstSt;
                                break;
                            }
                            else if ((int)(strings[i].substring(j,j+1).charAt(0)) < (int)(strings[k].substring(j,j+1).charAt(0))){
                                break;
                            }
                        }
//                        if (count==firstSt.length()){
//                            strings[i] = secondSt;
//                            strings[k] = firstSt;
//                        }
                    }
                }
            }

        }
        String[] answer = strings;
        return answer;
    }
}
