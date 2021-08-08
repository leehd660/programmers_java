package Level1;

import java.util.ArrayList;
import java.util.List;

public class 소수찾기 {
    public static void main(String[] args) {
        System.out.println(solution2(25));
    }

    public static int solution(long n) {
        int answer =1;
        if (n==2) answer = 1;
        for (long i=3; i<=n; i+=2){
            for(long j=3; j<=i; j+=2) {
                if(j==i){
                    answer +=1;
                }
                if(i%j ==0){
                    break;
                }

            }
        }
        return answer;
    }

    public static int solution1(int n) {
        //15같은 소수 *소수는 걸러내지 못함.
        int answer = n-(n/2);
        int sqrt = (int)Math.sqrt(n);
        for (int i=3; i<=sqrt; i+=2){
            int j =0;
            while(n>Math.pow(i,j+2)){
                j++;
            }
            answer -= j;
        }

        return answer;
    }

    public static int solution2(int n){
        List<Integer> numList = new ArrayList<>();
        numList.add(2);
        for (int i=3; i<n+1; i+=2){
            numList.add(i);
        }
        int sqrt = (int)Math.sqrt(n);
        for (int i=3; i <sqrt+1; i+=2){
            for (int j=i; j<=(n/i); j+=2){
//                System.out.println("j는 "+ j);
//                System.out.println("n/j는 "+ n/j);
                numList.remove(Integer.valueOf(i*j));
            }
        }
        for (int i : numList){
            System.out.println(i);
        }
        int answer = numList.size();
        return answer;
    }
}
