class Solution {
    public boolean isAnagram(String s, String t) {
        s=s.toLowerCase();
        int[] arr=new int[26];
        int[] arr2=new int[26];

        for(char cs:s.toCharArray()){
            arr[cs - 'a']++;
        }
        for(char ts:t.toCharArray()){
            arr2[ts - 'a']++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr2[i]) return false;
        } 
        return true;
    }
}