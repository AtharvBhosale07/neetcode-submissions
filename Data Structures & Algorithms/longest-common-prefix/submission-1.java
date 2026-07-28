class Solution {
    public String longestCommonPrefix(String[] strs) {

        // Edge case: empty array
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Compare each character of the first string
        for (int i = 0; i < strs[0].length(); i++) {

            char currentChar = strs[0].charAt(i);

            // Compare with all remaining strings
            for (int j = 1; j < strs.length; j++) {

                // If current string is shorter
                // OR characters don't match
                if (i >= strs[j].length() || strs[j].charAt(i) != currentChar) {
                    return strs[0].substring(0, i);
                }
            }
        }

        // Entire first string is the common prefix
        return strs[0];
    }
}