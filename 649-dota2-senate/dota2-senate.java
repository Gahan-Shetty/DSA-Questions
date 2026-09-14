class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> radiant=new LinkedList<>();
        Queue<Integer> dire=new LinkedList<>();

        for(int i=0;i<senate.length();i++){
            if(senate.charAt(i)=='R')
            radiant.offer(i);
            else
            dire.offer(i);
        }

        while(!radiant.isEmpty() && !dire.isEmpty()){
            int r=radiant.poll();
            int d=dire.poll();
            int n=senate.length();

            if(r<d)
            radiant.offer(r+n);
            else
            dire.offer(d+n);
        }
        if(radiant.isEmpty()) return "Dire"; else return "Radiant";
    }
}