

class Solution {

    public int[] plusOne(int[] digits) {
        int lenth = digits.length;
        for (int i = lenth-1; i >=0; i--) {
            digits[i]++;
            digits[i]=digits[i]%10;
            if(digits[i]!=0){
                return digits;
            }
        }
        digits = new int[lenth+1];
        digits[0]=1;
        return digits;
    }
}
