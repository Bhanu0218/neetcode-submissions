class Solution {
    public boolean isPalindrome(String s) {

        int length = s.length();

        // String cleaned = "";
        // for(int i=0; i<length; i++) {
        //     if(isAlphaNumeric(s.charAt(i))) {
        //         cleaned += Character.toLowerCase(s.charAt(i));
        //     }
        // }

        // String reversed = "";
        // for(int i=cleaned.length()-1; i>=0; i--) {
        //     reversed += cleaned.charAt(i);
        // }
        // return reversed.equals(cleaned);

        // String cleaned = s.replaceAll("[^a-zA-z0-9]", "").toLowerCase();
        // String reversed = new StringBuilder(cleaned).reverse().toString();

        // return cleaned.equals(reversed);

        int left = 0;
        int right = length - 1;

        while(left < right) {
            if(!isAlphaNumeric(s.charAt(left))) {
                left++;
                continue;
            }
            if(!isAlphaNumeric(s.charAt(right))) {
                right--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) return false;

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
