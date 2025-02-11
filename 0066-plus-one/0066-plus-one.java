class Solution {
    public int[] plusOne(int[] digits) {
        int m = digits.length;
        for(int i = m-1; i>=0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            } 
            digits[i] = 0;
        }
        
        int[] digitNew = new int[m+1];
        for(int i = 0; i < m; i++){
            digitNew[i] = digits[i];
        }
        digitNew[0] = 1;
        return digitNew;
    }
}