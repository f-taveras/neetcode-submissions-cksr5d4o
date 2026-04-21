class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
       
        int[] left_products = new int[length];
        int[] right_products = new int[length];
        int[] result = new int[length];

        left_products[0] = 1;
        right_products[length - 1] = 1;
        
        
        for(int i = 1; length>i;i++){
            left_products[i] = nums[i - 1] * left_products[i - 1];

        }

        for(int i = length - 2; i>= 0; i--){
            right_products[i] = nums[i + 1] * right_products[i + 1];
        } 
     for(int i =0; i<result.length;i++){
        result[i] = right_products[i] * left_products[i];
     }

        System.out.println(Arrays.toString(right_products));
        System.out.println(Arrays.toString(left_products));

        return result;
    }
}  
