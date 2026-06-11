class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=left; i<=right; i++){
            boolean b = true;
            int n=i;

            while(n>0){
                int digit = n%10;
                n = n/10;

                if(digit == 0){
                    b=false;
                    break;
                }

                if(i%digit != 0){
                    b = false;
                    break;
                }else{
                    b = true;
                }

            }

            if(b){
                arr.add(i);
            }
        }
        return arr;
    }
}