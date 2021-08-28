package Level2;

public class N개의최소공배수 {
    public static void main(String[] args) {
        int[]arr={2,6,8,14};
        System.out.println(solution(arr));
    }
    public static int solution(int[] arr) {
        for (int i=0; i< arr.length-1; i++){
            for (int j=i+1; j<arr.length; j++){
                int small = arr[i];
                int big = arr[j];
                if (arr[i]<arr[j]){
                    arr[i]=big;
                    arr[j]=small;
                }
            }
        }
        System.out.println(arr[0]);
        int i =1;

        int num = 0;
        while (true) {
            int count =0;
            num = arr[0]*i;
            for (int k=1; k<arr.length; k++){
                if (num%arr[k] != 0){
                    break;
                }
                else {
                    count++;
                }
            }
            if (count == arr.length-1){
                break;
            }
            i++;
        }
        int answer = num;
        return answer;
    }
}
