class Solution {
    public boolean isValid(String s) {

        // while(s.contains("()") ||
        // s.contains("[]") || s.contains("{}")) {
        //     s = s.replace("()", "");
        //     s = s.replace("[]", "");
        //     s = s.replace("{}", "");
        // }

        // return s.isEmpty();

        Deque<Character> queue = new ArrayDeque<>();

        for(char c : s.toCharArray()) {
            if(c == '(' || c == '{'|| c == '[') {
                queue.push(c);
            } else {
                if(!queue.isEmpty()) {
                    char popped = queue.peek();
                    if(popped == '(' && c == ')' ||
                    popped == '{' && c == '}' ||
                    popped == '[' && c == ']')
                    {
                        queue.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return queue.isEmpty();
    }
}
