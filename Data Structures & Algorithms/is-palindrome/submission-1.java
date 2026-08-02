class Solution {
    public boolean isPalindrome(String s) {

        // StringBuilder stringBuilder = new StringBuilder();
        // for(char c : s.toCharArray()) {
        //     if(Character.isLetterOrDigit(c)) {
        //         stringBuilder.append(Character.toLowerCase(c));
        //     }
        // }
        // return stringBuilder.toString().equals(stringBuilder.reverse().toString());

        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String newStr = new StringBuilder(cleaned).reverse().toString();

        return cleaned.equals(newStr);
    }
}
