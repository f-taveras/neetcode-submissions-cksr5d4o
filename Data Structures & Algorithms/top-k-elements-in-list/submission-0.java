class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();


        for(int n: nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

        int[] topK = new int[k];
        queue.addAll(map.keySet());
        int i =0;
        while(k>i){
            topK[i] = queue.poll();
            i++;
        }

return topK;


        
    }
}
