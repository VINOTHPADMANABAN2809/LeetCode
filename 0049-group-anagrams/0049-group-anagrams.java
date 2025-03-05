import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList<>();
        }
        
        HashMap<String, List<String>> groupAnagram = new HashMap<>();
        
        for (String s : strs) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);
            
            if (groupAnagram.containsKey(key)) {
                groupAnagram.get(key).add(s);
            } else {
                groupAnagram.put(key, new ArrayList<>());
                groupAnagram.get(key).add(s);
            }
        }
        
        return new ArrayList<>(groupAnagram.values());
    }
}