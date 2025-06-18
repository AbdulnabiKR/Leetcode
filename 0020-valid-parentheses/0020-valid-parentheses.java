class Solution {
    public boolean isValid(String s) {
       int n=s.length();
       Stack<Character>st=new Stack<>();
       for(char ch:s.toCharArray()){
        //String is converted to char array
        if(ch=='(' || ch=='{' || ch=='['){
            st.push(ch);
        }
        else{
            if(st.isEmpty())
              return false;
              char top=st.pop();
            if(ch==')' && top!='(' || ch=='}' && top!='{' || ch==']' && top!='[')
              return false;
        }
       }
       return st.isEmpty();//if all these matches then stack will be empty so return it whcih automatically return true
    }

}