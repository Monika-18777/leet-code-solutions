class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
      int s=0;
      for(int x:nums)
      {
        if(mp.get(x)==1)
        {
            s+=x;
        }
      }
       
        return s;

    }
}