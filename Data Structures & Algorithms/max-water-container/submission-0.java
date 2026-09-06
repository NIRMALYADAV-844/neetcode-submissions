class Solution {
    public int maxArea(int[] heights) {
        int lp = 0;
        int rp = heights.length - 1;
        int ans = 0;

        while (lp < rp) {

            int height = Math.min(heights[lp], heights[rp]);
            int width = rp - lp;

            int area = height * width;

            ans = Math.max(ans, area);

            if (heights[lp] < heights[rp]) {
                lp++;
            } else {
                rp--;
            }
        }

        return ans;
    }
}