class Solution {
    public int addDigits(int num) {
        int sum=0;;

        for(int i=0; i<num; i++){
        sum=0;
        while(num > 0){
            int digit = num%10;
            sum += digit;
            num = num/10;
        }
          num=sum;  
        }
        
        return sum;
    }
}