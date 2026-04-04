class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> freqMap = new HashMap<>();
        
        for(String s: strs){
            int[] freq = new int[26];

            for(char c: s.toCharArray()){
                freq[c - 'a']++;
            }

            String key = Arrays.toString(freq);
            freqMap.putIfAbsent(key, new ArrayList<>());
            freqMap.get(key).add(s);

        }

        return new ArrayList<>(freqMap.values());
        
    }
}
