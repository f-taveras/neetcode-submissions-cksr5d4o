class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int n: nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }


        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));



        int[] topK = new int[k];
        int i= 0;
        queue.addAll(map.keySet());
        while(i<k){
              topK[i] = queue.poll();  
              i++;

        }

return topK;
        
    }
}
