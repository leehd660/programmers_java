package Level1;

public class 카카오_실패율 {
    public static void main(String[] args) {
        int N=5;
        int[] stagers = {2,1,2,6,2,4,3,3};
        for (int i =0; i< solution(N,stagers).length; i++){
            System.out.println();
        }
    }
    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        for (int i=1; i<N+1; i++){
            answer[i-1]=i;
        }
        double[] numPeople = new double[N];
        int num1 = 0;
        for (int i=1; i<N+1; i++){
            int num2 = 0;
            for (int j=0; j<stages.length; j++){
                if (stages[j]==i){
                    num2++;
                }
            }
//            System.out.println(num1+"num1");
//            System.out.println(num2+"num2");
            numPeople[i-1]= ((double)num2/(double)(stages.length-num1));
            System.out.println((num2)+"zz"+ (stages.length-num1));
            System.out.println(numPeople[i-1]+"ㅎㅎ");
            num1 +=num2;
        }
        for(int i=0; i<numPeople.length-1; i++){
            for(int j=i+1; j<numPeople.length; j++){
                int firstNum = answer[i];
                int secondNum = answer[j];
                double firstprop = numPeople[i];
                double secondprop = numPeople[j];
                if(numPeople[i]<numPeople[j]){
                    answer[i]= secondNum;
                    answer[j]= firstNum;
                    numPeople[i] = secondprop;
                    numPeople[j] = firstprop;
                }
                else if (numPeople[i]==numPeople[j]){
                    if (firstNum<secondNum){
                        answer[i] =secondNum;
                        answer[j] =firstNum;
                    }
                }
            }
        }

        return answer;
    }
}
