class Solution {
    public boolean isPalindrome(String s) {

        int length = s.length();

        // StringBuilder stringBuilder = new StringBuilder();
        // for(char c : s.toCharArray()) {
        //     if(Character.isLetterOrDigit(c)) {
        //         stringBuilder.append(Character.toLowerCase(c));
        //     }
        // }
        // return stringBuilder.toString().equals(stringBuilder.reverse().toString());

        // String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // String newStr = new StringBuilder(cleaned).reverse().toString();

        // return cleaned.equals(newStr);

        int left = 0;
        int right = length - 1;

        while(left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            if(!isAlphaNumeric(leftChar)) {
                left++;
                continue;
            }
            if(!isAlphaNumeric(rightChar)) {
                right--;
                continue;
            }
            if(Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) return false;
            left++;
            right--;
        }
        return true;
    }

    public boolean isAlphaNumeric(char c) {
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}
