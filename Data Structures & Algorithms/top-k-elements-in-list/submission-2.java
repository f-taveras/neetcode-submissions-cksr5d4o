class Solution {
    public int[] topKFrequent(int[] nums, int k) {

    
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for(int n: nums){
            freqMap.put(n, freqMap.getOrDefault(n, 0) + 1);
        }


        PriorityQueue<Integer> queue = new PriorityQueue<>((a , b) -> freqMap.get(b) - freqMap.get(a));



        int[] topK = new int[k];
        int i= 0;
        queue.addAll(freqMap.keySet());
        while(i<k){
            topK[i] = queue.poll();
            i++;
        }

        return topK;


    }
}
