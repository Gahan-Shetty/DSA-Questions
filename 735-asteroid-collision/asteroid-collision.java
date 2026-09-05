class Solution {
    public int[] asteroidCollision(int[] asteroids) {
       Stack<Integer>stack=new Stack<>();
        for(int a:asteroids)
        {
            Boolean alive=true;
            while(!stack.isEmpty() && stack.peek()>0 && a<0 ){
                if(Math.abs((stack.peek()))>Math.abs((a))){
                alive=false;
                break;
                }
                else if(Math.abs(stack.peek())==Math.abs((a))){
                stack.pop();
                alive=false;
                break;
                }
                else{
                    stack.pop();
                }
            }
            if(alive)
            stack.push(a);
        }
        int[] res=new int[stack.size()];
        int x=0;
        for(int i:stack)
        res[x++]=i;
        return res;

    }
}