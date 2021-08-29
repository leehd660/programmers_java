package Level2;

public class 행렬의곱셈 {
    public static void main(String[] args) {
        int[][] arr1 ={{2,3},{4,2},{3,1}};
        int[][] arr2 = {{5,4},{2,4}};
        System.out.println(solution(arr1,arr2));
    }
    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        for (int i=0; i<arr1.length; i++) {
            for (int j=0; j<arr2[0].length; j++){
                int ansNum =0;
                for (int k=0; k<arr1[i].length; k++){
                    ansNum += arr1[i][k]*arr2[k][j];
                }
                answer[i][j]= ansNum;
            }
        }
        return answer;
    }
}
