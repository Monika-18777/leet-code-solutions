class Solution {
    public List<String> findRepeatedDnaSequences(String s) {

        HashMap<String,Integer>mp=new HashMap<>();
         List<String>result=new ArrayList<>();
         for(int i=0;i<=s.length()-10;i++)
         {
            String sub=s.substring(i,i+10);
            mp.put(sub,mp.getOrDefault(sub,0)+1);
            if(mp.get(sub)==2)
            {
                result.add(sub);
            }
         }
         return result;
        
    }
}