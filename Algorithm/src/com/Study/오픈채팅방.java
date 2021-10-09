
import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        HashMap<String, String> map = new HashMap<>();
        ArrayList<String[]> result = new ArrayList<>();
        
        for(String log : record){
            String[] split_word = log.split(" ");
            
            if(split_word[0].equals("Enter")){
                map.put(split_word[1], split_word[2]);
                result.add(split_word);
            }
            else if(split_word[0].equals("Change")){
                map.put(split_word[1], split_word[2]);
            }
            else{
                result.add(split_word);
            }
        }
            
        String[] answer = new String[result.size()];
        int num = 0;
        for(String[] split_words : result){
            String nickname = map.get(split_words[1]);

            if(split_words[0].equals("Enter")){
                answer[num++] = nickname + "님이 들어왔습니다.";
            }
            else{
                answer[num++] = nickname + "님이 나갔습니다.";
            }
        }
        return answer; 
    }    
}
