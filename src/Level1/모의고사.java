package Level1;

import java.util.ArrayList;
import java.util.List;

public class 모의고사 {
    public static void main(String[] args) {
        int[] numlist = {2,1,2,3,2};
        for (int i : solution1(numlist)){
            System.out.println(i);
        }
    }

    public static int[] solution(int[] answers) {
        List<Integer> ans = new ArrayList<>();
        int[] numlist = {0,0,0};
        int num1 =0;
        int num2 =0;
        int num3 =0;
        for (int i=1; i<answers.length+1; i++) {
            if (answers[i-1]%5 == i%5){
                numlist[0]++;
                num1++;
            }
            int num2_1 =0;
            switch (i%8){
                case 1: num2_1=2; break;
                case 2: num2_1=1; break;
                case 3: num2_1=2; break;
                case 4: num2_1=3; break;
                case 5: num2_1=2; break;
                case 6: num2_1=4; break;
                case 7: num2_1=2; break;
                case 0: num2_1=5; break;
            }
            if (num2_1 == answers[i-1]){
                numlist[1]++;
                num2++;
            }
            int num3_1 =0;
            switch (i%10) {
                case 1: num3_1=3; break;
                case 2: num3_1=3; break;
                case 3: num3_1=1; break;
                case 4: num3_1=1; break;
                case 5: num3_1=2; break;
                case 6: num3_1=2; break;
                case 7: num3_1=4; break;
                case 8: num3_1=4; break;
                case 9: num3_1=5; break;
                case 0: num3_1=5; break;
            }
            if (num3_1==answers[i-1]){
                numlist[2]++;
                num3++;
            }
        }
        for (int i=0; i<2; i++){
            for(int j=i+1; j<3; j++){
                int big = numlist[i];
                int small = numlist[j];
                if(numlist[i]<numlist[j]){
                    numlist[i] = big;
                    numlist[j] = small;
                }
            }
        }
        System.out.println(numlist[0]);
        System.out.println(num1+";;;"+num2+";;;"+num3+";;;");
        if(numlist[0] == num1){
            ans.add(1);
        }
        if(numlist[0] == num2){
            ans.add(2);
        }
        if(numlist[0] == num3){
            ans.add(3);
        }
        int[] answer = new int[ans.size()];
        for (int i=0; i<ans.size(); i++){
            answer[i]=ans.get(i);
        }
        return answer;
    }






    public static int[] solution1(int[] answers) {
        List<Integer> ans = new ArrayList<>();
        int[] numlist = {0,0,0};
        int[] num2List = {2,1,2,3,2,4,2,5};
        int[] num3List = {3,3,1,1,2,2,4,4,5,5};
        int num1 =0;
        int num2 =0;
        int num3 =0;
        for (int i=0; i<answers.length; i++) {
            if (answers[i] % 5 == (i+1) % 5) {
                numlist[0]++;
                num1++;
                System.out.println(i+"ㅎ");
            }
            if (answers[i] == num2List[i%8]){
                numlist[1]++;
                num2++;
            }
            if (answers[i] == num3List[i%10]){
                numlist[2]++;
                num3++;
            }
        }
        System.out.println(num1 +"g"+num2 +"g"+num3);
        for (int i=0; i<2; i++){
            for(int j=i+1; j<3; j++){
                int big = numlist[i];
                int small = numlist[j];
                if(numlist[i]<numlist[j]){
                    numlist[i] = small;
                    numlist[j] = big;
                }
            }
        }
        System.out.println(numlist[0]);
        System.out.println(num1+";;;"+num2+";;;"+num3+";;;");
        if(numlist[0] == num1){
            ans.add(1);
        }
        if(numlist[0] == num2){
            ans.add(2);
        }
        if(numlist[0] == num3){
            ans.add(3);
        }
        int[] answer = new int[ans.size()];
        for (int i=0; i<ans.size(); i++){
            answer[i]=ans.get(i);
        }
        return answer;
    }
}
