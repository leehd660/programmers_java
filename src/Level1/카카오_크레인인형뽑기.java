package Level1;

import java.util.ArrayList;
import java.util.List;

public class 카카오_크레인인형뽑기 {
    public static void main(String[] args) {
        int[][] arr = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] arr1 = {1,5,3,5,1,2,1,4};
        System.out.println(solution(arr,arr1));
    }
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> bucket = new ArrayList<>();
        int beforeNum = 0;
        for (int i=0; i<moves.length; i++){
            for (int j=0; j< board.length; j++){
                if (board[j][moves[i]-1] != 0){
                    System.out.println(beforeNum+"비교대상");
                    System.out.println(i+""+j+" "+(moves[i]-1)+"");
                    if (beforeNum!=board[j][moves[i]-1]) {
                        bucket.add(board[j][moves[i]-1]);
                        beforeNum = board[j][moves[i]-1];
                        board[j][moves[i] - 1] = 0;
                        System.out.println(beforeNum +"추가한거");
                        break;
                    }
                    else {
                        System.out.println(bucket.get(bucket.size()-1)+"지워지는거");
                        bucket.remove(bucket.size()-1);
                        beforeNum = bucket.get(bucket.size()-1);
                        answer +=2;
                        break;
                    }

                }
            }
//            if (bucket.size() > 2 && bucket.get(bucket.size()-1)==bucket.get(bucket.size())-2){
//                bucket.remove(bucket.size()-1);
//                bucket.remove(bucket.size()-2);
//            }43113 24
        }
        for (int i : bucket){
            System.out.println(i+"남은거");
        }


        return answer;
    }
}
