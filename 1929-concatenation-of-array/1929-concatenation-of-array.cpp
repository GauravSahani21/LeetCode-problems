class Solution {
public:
    vector<int> getConcatenation(vector<int>& nums) {
        int s = nums.size();
        int n = s*2;
        nums.resize(n);

        for(int i=0; i<s;i++){
            nums[s+i] = nums[i];
        }

        return nums;
    }
};