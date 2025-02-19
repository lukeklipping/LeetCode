class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');


        for(char c : s.toCharArray()){
            if(map.containsValue(c)){
                stk.push(c);
            } else if(map.containsKey(c)){
                if(stk.isEmpty() || map.get(c) != stk.pop()){
                    return false;
                }
            }
        }
        return stk.isEmpty();
    }
}