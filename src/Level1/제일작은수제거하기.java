package Level1;

public class 제일작은수제거하기 {
    public static void main(String[] args) {

    }

    public static int[] solution(int[] arr) {
        int min =arr[0];
        String str ="";
        if (arr.length==1){
            int[] answer = {-1};
            return answer;
        }
        else{
            for (int i:arr) {
                if (min>i){
                    min = i;
                }
            }
            for (int i:arr){
                if (i != min){
                    str += i+",";
                }
            }
            String[] array = str.split(",");
            int[] answer = new int[arr.length-1];
            for (int i=0; i<answer.length; i++){
                answer[i] = Integer.parseInt(array[i]);
            }
            return answer;
        }
    }
}
