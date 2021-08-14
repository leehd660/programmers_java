package Level1;

public class 위클리일주차 {
    public long solution(int price, long money, int count) {
        long answer = 0;
        long needMoney = 0;
        for (int i=1; i<count+1; i++){
            needMoney += price*i;
        }
        if (needMoney>money){
            answer = needMoney-money;
        }
        else {
            answer = 0;
        }
        return answer;
    }
}
