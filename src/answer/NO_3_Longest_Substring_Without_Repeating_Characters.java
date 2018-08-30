package answer;

import java.util.HashMap;
import java.util.Map;

public class NO_3_Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {
        if(s == null) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int start = 0;
        int maxLen = 0;
        int len = 0;
        for(int i = 0; i < s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                len++;
                if(len > maxLen) maxLen = len;
                map.put(s.charAt(i), i);
            }else{
                int index = map.get(s.charAt(i));
                for (int j = start; j <= index; j++){
                    map.remove(s.charAt(j));
                }
                map.put(s.charAt(i), i);
                start = index+1;
                len = i-index;
            }
        }
        return maxLen;
    }
}
