class Solution {
    public boolean hasDuplicate(int[] nums) {


        HashSet<Integer> result = new HashSet<>();


        for(int n: nums){
            if(result.contains(n)) return true;
            result.add(n);
        } 

        return false;

        
    }
}