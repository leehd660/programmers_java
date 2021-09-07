package Level2;

public class 가장큰정사각형찾기 {
    public static void main(String[] args) {
        int[][] arr = {{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}};
        int[][] arr1 = {{0,0,1,1},{1,1,1,1}};
        int[][] arr2 = {{1,1,1}};
        System.out.println(solution1(arr2));
    }
    public int solution(int [][]board) {
        int answer = 1234;

        int lineNum =0;
        if (board[0].length >= board.length){
            lineNum = board.length;
        }
        else {
            lineNum = board[0].length;
        }

        for (int i=0; i< board.length-(lineNum-1); i++){
            for (int j=0; j<board[0].length-(lineNum-1); j++){
                if (board[i][j] == 0){
                    continue;
                }
                else {

                }
            }
        }

        return answer;
    }


    public static int solution1(int [][]board)
    {
        int answer = 0;

        int lineNum =0;
        if (board[0].length >= board.length){
            lineNum = board.length;
        }
        else {
            lineNum = board[0].length;
        }
        System.out.println(lineNum+"최대 변 길이");

        int[] rowArr = new int[board[0].length];
        for (int i=0; i<board[0].length; i++){
            int count =0;
            for (int j=0; j<board.length; j++){
                if(board[j][i] == 1 && j==board.length-1){
                    count++;
                    rowArr[i] = count;
                    count = 0;
                }
                else if (board[j][i] == 1){
                    count++;
                }
                else {
                    if(count > rowArr[i]){
                        rowArr[i] = count;
                    }
                    count = 0;
                }
            }
        }
        for (int i : rowArr){
            System.out.println(i+"row");
        }
        int[] colArr = new int[board.length];
        for (int i=0; i<board.length; i++){
            int count =0;
            for (int j=0; j<board[0].length; j++){
                if(board[i][j] == 1 && j==board[0].length-1){
                    count++;
                    colArr[i] = count;
                    count = 0;
                }
                else if (board[i][j] == 1){
                    count++;
                }
                else {
                    if(count > colArr[i]){
                        colArr[i] = count;
                    }
                    count = 0;
                }
            }
        }
        for (int i : colArr){
            System.out.println(i+"col");
        }

        boolean colTest = false;
        boolean rowTest = false;
        for (int i=lineNum; i>0; i--) {
            int count =0;
            for(int a : colArr){
                if (a>=i){
                    count++;
                }
                else {
                    count =0;
                }
                if (count == i){
                    colTest = true;
                }
            }
            int count1=0;
            for(int a : rowArr){
                if (a>=i){
                    count1++;
                }
                else {
                    count1 =0;
                }
                if (count1 == i){
                    rowTest = true;
                }
            }
            if (rowTest=true && colTest==true){
                answer = i*i;
                break;
            }
            count1 =0;
            count =0;
        }

        return answer;
    }
}
