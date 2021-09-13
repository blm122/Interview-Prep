//O(n^2) solution. An O(n) solution is possible using a hashmap where you pass through
//the given array once, adding values into the hashmap as you encounter them and see if
//their complement is already in the table


class Two-Sum {
    public int[] twoSum(int[] nums, int target) {
        
        int x = 0;
        int y = x + 1;
        
        int[] answer = new int[2];
        
        
        for(x = 0; x < nums.length; x++)
        {
            for(y = x + 1; y < nums.length; y++)
            {
                if(nums[x] + nums[y] == target)
                {
                    answer[0] = x;
                    answer[1] = y;
                   
                }
            }
        }
        
        return answer;
        
    }
}
