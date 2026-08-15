class Solution {
    public boolean closeStrings(String word1, String word2) {
        HashMap<Character,Integer>res= new HashMap<>();
        HashMap<Character,Integer>ans= new HashMap<>();
        for (char i : word1.toCharArray()){
            if(!res.containsKey(i)){
                res.put(i,1);
            }
            else{
                res.put(i,res.get(i)+1);
            }
        }
        for (char i : word2.toCharArray()){
            if(!ans.containsKey(i)){
                ans.put(i,1);
            }
            else{
                ans.put(i,ans.get(i)+1);
            }
        }
        List<Integer>list1=new ArrayList<>(res.values());
        List<Integer>list2=new ArrayList<>(ans.values());
        Collections.sort(list1);
        Collections.sort(list2);
        if(res.keySet().equals(ans.keySet()) && list1.equals(list2))
        return true;

        return false;

    }
}