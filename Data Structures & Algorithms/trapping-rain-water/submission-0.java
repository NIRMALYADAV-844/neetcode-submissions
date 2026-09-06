class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int ans = 0;
        int lp = 0, rp = n-1;

        int lmax = 0, rmax = 0;
        
        while(lp < rp){
            lmax = Math.max(lmax, height[lp]);
            rmax = Math.max(rmax, height[rp]);

            if(lmax < rmax){
                ans += (lmax - height[lp]);
                lp++;
            }else {
                ans += (rmax - height[rp]);
                rp--;
            }
        }
        return ans;
    }
}
