class Solution {
    int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a%b; 
            a = temp;
        }
        return a;
    }
    public int gcdOfOddEvenSums(int n) {
        int Odd = 0;
        int Even = 0;

        for(int i=0; i<n; i++){
            if(i%2 == 2){
                Even++;
            }else{
                Odd++;
            }
        }

        return gcd(Odd, Even);
    }
}