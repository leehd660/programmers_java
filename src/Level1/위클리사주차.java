package Level1;

public class 위클리사주차 {
    public static void main(String[] args) {
        String[] table = {"SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", "GAME C++ C# JAVASCRIPT C JAVA"};
        String[] language = {"JAVA", "JAVASCRIPT"};
        int[] preference = {7, 5};
        System.out.println(solution(table,language,preference));

    }


    public static String solution(String[] table, String[] languages, int[] preference) {
        String answer = "SI";
        int answerScore = 0;
        int compareScore = 0;
        //테이블 쪼개기
        String[][] newTable = new String[5][6];
        for (int i=0; i<table.length; i++){
            int j=0;
            for (String s: table[i].split(" ")) {
                newTable[i][j]=s;
                j++;
            }
        }

        //점수 비교하기
        for (int k=0; k< newTable.length; k++){
            for (int i=1; i< newTable[0].length; i++){
                for (int j=0; j< languages.length; j++){
                    if (newTable[k][i].equals(languages[j])){
                        compareScore+=(6-i)*preference[j];
                    }
                }
            }
            if (answerScore<compareScore){
                System.out.println(answer+"  "+answerScore + " gg " + newTable[k][0]+"  "+compareScore);
                answerScore = compareScore;
                answer = newTable[k][0];
            }
            else if (answerScore==compareScore){
                int firstNum = answer.substring(0,1).charAt(0);
                int compareNum = newTable[k][0].substring(0,1).charAt(0);
                if (firstNum > compareNum) {
                    answer = newTable[k][0];
                }
            }
            compareScore = 0;
        }
        return answer;
    }
}
