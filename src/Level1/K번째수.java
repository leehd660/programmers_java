package Level1;

public class K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            answer[i] = findArr(array, commands[i][0] - 1, commands[i][1] - 1)[commands[i][2] - 1];
        }
        return answer;
    }

    public static int[] findArr(int[] arr, int a, int b) {
        int[] arrSol = new int[b - a + 1];
        for (int i = a; i < b + 1; i++) {
            arrSol[i - a] = arr[i];
        }
        for (int i = 0; i < arrSol.length - 1; i++) {
            for (int j = i + 1; j < arrSol.length; j++) {
                int small = arrSol[i];
                int big = arrSol[j];
                if (arrSol[i] > arrSol[j]) {
                    arrSol[j] = small;
                    arrSol[i] = big;
                }
            }
        }
        return arrSol;
    }
}
