class Solution {
    public String decodeString(String s) {
        Stack<Integer>numStck=new Stack<>();
        Stack<String>strStck=new Stack<>();
        
        String current="";
        int num=0;

        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                num=num*10+(c-'0');
            }
            else if(c=='['){
                numStck.push(num);
                strStck.push(current);

                num=0;
                current="";
            }
            else if(c==']'){
                int repeat=numStck.pop();
                String previous=strStck.pop();

                current=previous+current.repeat(repeat);
            }
            else{
                current+=c;
            }
        }
        return current;
    }
}