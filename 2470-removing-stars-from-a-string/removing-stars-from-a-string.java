class Solution {
    public String removeStars(String s) {
       Stack<Character>stack=new Stack<>();
       for (char i : s.toCharArray()){
        if( i =='*'){
            stack.pop();
        }
        else{
        stack.push(i);
        }
       }
       StringBuilder res=new StringBuilder();
       for(char c : stack)
       res.append(c);

       return res.toString();

    }
}