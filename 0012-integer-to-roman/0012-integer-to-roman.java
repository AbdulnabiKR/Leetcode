class Solution {
    public String intToRoman(int num) {
        String m[]={"","M","MM","MMM"};//1000 place
     String c[]={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};//100 place
     String x[]={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};//10 place
     String i[]={"","I","II","III","IV","V","VI","VII","VIII","IX"};//1 place

     return m[num/1000]+c[(num%1000)/100]+x[(num%100)/10]+i[num%10];


    }
}