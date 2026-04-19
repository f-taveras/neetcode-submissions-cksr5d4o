class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> checked = new HashSet<>();

        for(int n: nums){
            if(checked.contains(n)) return true;

        checked.add(n);
        }
        return false;
        
    }
}