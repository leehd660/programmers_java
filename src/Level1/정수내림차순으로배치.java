package Level1;

public class 정수내림차순으로배치 {
    public static void main(String[] args) {
        System.out.println(solution(1818188));
    }

    public static long solution(long n) {
        String num = Long.toString(n);
        String[] str_list = num.split("");
        int[] num_list = {0,0,0,0,0,0,0,0,0,0};
        for (int i=0; i<str_list.length; i++){
            switch (Integer.parseInt(str_list[i])){
                case 0: num_list[0]++; break;
                case 1: num_list[1]++; break;
                case 2: num_list[2]++; break;
                case 3: num_list[3]++; break;
                case 4: num_list[4]++; break;
                case 5: num_list[5]++; break;
                case 6: num_list[6]++; break;
                case 7: num_list[7]++; break;
                case 8: num_list[8]++; break;
                case 9: num_list[9]++; break;
            }
        }
        String str ="";
        for (int i=9; i>-1; i--){
            for (int j=0; j<num_list[i]; j++){
                str += Integer.toString(i);
            }
        }
        long answer = Long.parseLong(str);
        return answer;
    }


//    public static long solution1(long n) {
//        String num = Long.toString(n);
//        String[] str_list = num.split("");
//        String str = "";
//        for (int i =9; i>-1; i--) {
//            for (int j=0; j<str_list.length; j++){
//                if (Integer.parseInt(str_list[j])==i){
//                    str += Integer.toString(i);
//                }
//            }
//        }
//        long answer = Integer.parseInt(str);
//        return answer;
//    }
//
//    public static long solution2(long n) {
//        String num = Long.toString(n);
//        String[] str_list = num.split("");
//        int[] num_list = {0,0,0,0,0,0,0,0,0,0};
//        for (int i=0; i<str_list.length; i++){
//            switch (Integer.parseInt(str_list[i])){
//                case 0: num_list[0]++; break;
//                case 1: num_list[1]++; break;
//                case 2: num_list[2]++; break;
//                case 3: num_list[3]++; break;
//                case 4: num_list[4]++; break;
//                case 5: num_list[5]++; break;
//                case 6: num_list[6]++; break;
//                case 7: num_list[7]++; break;
//                case 8: num_list[8]++; break;
//                case 9: num_list[9]++; break;
//            }
//        }
//
//        long answer = Long.parseLong();
//        return answer;
//    }
}
