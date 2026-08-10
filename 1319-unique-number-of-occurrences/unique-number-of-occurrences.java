class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>ans=new HashMap<>();
        HashSet<Integer>res=new HashSet<>();
        for(int i:arr)
        {
            if(!ans.containsKey(i)){
                ans.put(i,1);
            }
            else{
                ans.put(i,ans.get(i)+1);
            }
        }
        for(int i:ans.values()){
            if(res.contains(i))
            return false;
            else
            res.add(i);
        }
        return true;
    }
}