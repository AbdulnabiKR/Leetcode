class Solution {
    public void backTrack(String s,HashSet<String> dict,List<String> result,StringBuilder path,int start){
        if(start==s.length()){
            result.add(path.toString().trim());
            return;
        }
        for(int end=start+1;end<=s.length();end++){
            String word=s.substring(start,end);
            if(dict.contains(word)){
                int len=path.length();
                path.append(word).append(' ');  
                backTrack(s,dict,result,path,end);
                path.setLength(len);
            }
        }
    }
    public List<String> wordBreak(String s, List<String> wordDict) {
       List<String> result=new ArrayList<>();
       backTrack(s,new HashSet<>(wordDict),result,new StringBuilder(),0);
       return result;
    }
}
