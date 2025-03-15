class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int numVowelStr = 0;
        Set<Character> hs = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        for (int i = left; i <= right; i++) {
            String s = words[i];
            int n=s.length()-1;
            if (hs.contains(s.charAt(0)) && hs.contains(s.charAt(n))) {
                numVowelStr++;
            }
        }
        return numVowelStr;
    }
}
