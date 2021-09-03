package Level2;

public class 땅따먹기 {
    public static void main(String[] args) {
        int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
        System.out.println(solution(land));
    }
//    static int solution(int[][] land) {
//        int answer = 0;
//        int bigNum = 0;
//        int compareNum = 0;
//        for (int k=0; k<4; k++) {
//            compareNum += land[0][k];
//            int num = k;
//            for (int i = 1; i < land.length; i++) {
//                compareNum += land[i][findColumn(land,i,num)];
//                num=findColumn(land,i,num);
//            }
//            if (compareNum>bigNum){
//                bigNum = compareNum;
//            }
//            compareNum = 0;
//        }
//        answer = bigNum;.
//        return answer;
//    }
//
//    public static int findColumn (int[][] land, int rowNum,int notNum) {
//        int bigNum = 0;
//        int bigColumn = 0;
//        for (int i=0; i<4; i++){
//            if (i==notNum) {
//                continue;
//            }
//            else {
//                if (land[rowNum][i] > bigNum){
//                    bigNum = land[rowNum][i];
//                    bigColumn = i;
//                }
//            }
//        }
//        return bigColumn;
//    }
    static int solution(int[][] land) {
        int answer = 0;

        for (int i=1; i< land.length; i++) {
            for (int j=0; j<4; j++) {
                land[i][j] = land[i][j]+land[i-1][findColumn(land,i-1,j)];
            }
        }
        int big = 0;
        for (int i : land[land.length-1]){
            if (i>big){
                big = i;
            }
        }
        answer = big;
        return answer;
    }

    public static int findColumn (int[][] land, int rowNum,int notNum) {
        int bigNum = 0;
        int bigColumn = 0;
        for (int i=0; i<4; i++){
            if (i==notNum) {
                continue;
            }
            else {
                if (land[rowNum][i] > bigNum){
                    bigNum = land[rowNum][i];
                    bigColumn = i;
                }
            }
        }
        return bigColumn;
    }
}
