class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int lp = 0;
        int rp = str.length() - 1;
        while(lp < rp){
            if(str.charAt(lp) != str.charAt(rp)){
                return false;
            }
            lp++;
            rp--;
        }
        return true;
    }
}
