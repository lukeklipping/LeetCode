class Solution {
    private static int calc(char a, char b, char c){
        return (a == c || a == b) ? -1 : 1; 
    }

    public int romanToInt(String s) {
        
        int num = 0; 
        for(int i = 0; i < s.length(); i++){
            char charNext = (i + 1 < s.length()) ? s.charAt(i+1) : '\0';
            switch(s.charAt(i)){
                case 'I': 
                    num += 1 * calc(charNext, 'X', 'V'); 
                    break;
                case 'V':
                    num += 5;
                    break;
                case 'X':
                    num += 10 * calc(charNext, 'L', 'C');
                    break;
                case 'L':
                    num += 50;
                    break;
                case 'C':
                    num += 100 * calc(charNext, 'D', 'M');
                    break;
                case 'D':
                    num += 500;
                    break;
                case 'M':
                    num += 1000;
                    break;
            }
            
       }
        return num;
    }
}