package Level1;

import java.util.HashMap;

public class 완주하지못한선수 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer> compleName = new HashMap<>();
        for (String name : completion) {
            if (compleName.containsKey(name)){
                int count = compleName.get(name);
                compleName.put(name,count+1);
            }
            else {
                compleName.put(name,1);
            }
        }
        for (String name : participant) {
            if (!compleName.containsKey(name)){
                answer = name;
            }
            else if (compleName.get(name) == 0){
                answer = name;
            }
            else if (compleName.get(name) != 0){
                int count = compleName.get(name);
                compleName.put(name,count-1);
            }
            else if (compleName.get(name) != 0){
                answer = name;
            }
        }
        return answer;
    }
}
