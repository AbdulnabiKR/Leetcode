class Solution {
  public int romanToInt(String s) {
    int number=0,previous=0,answer=0;
    for(int i=s.length()-1;i>=0;i--){
        switch(s.charAt(i)){
            case 'I'->number=1;
            case 'V'->number=5;
            case 'X'->number=10;
            case 'L'->number=50;
            case 'C'->number=100;
            case 'D'->number=500;
            case 'M'->number=1000;
        }
        if(number<previous){
            answer-=number;
        }
        else{
            answer+=number;
        }
        previous=number;
    }
    return answer;
}

    }
