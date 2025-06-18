    class Solution {
        public int reverse(int x) {
            int reverse=0;
            while(x!=0){
                int rem=x%10;
                //Before checking the reverse there is need to check the overflow and underflow as mentioned in question
                //Integer.MAX_VALUE=2,147,483,647 and Integer.MIN_VALUE=-2,147,483,648 if code beyond max-overflow,if code below min-underflow
                if(reverse>Integer.MAX_VALUE/10 || reverse==Integer.MAX_VALUE/10 && rem>7)
                return 0;
                if(reverse<Integer.MIN_VALUE/10 || reverse==Integer.MIN_VALUE/10 && rem<-8)
                return 0;

                    reverse=reverse*10+rem;
                x=x/10;
            }
        return reverse;
        }
    }
        