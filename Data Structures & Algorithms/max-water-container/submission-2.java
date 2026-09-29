class Solution {
    public int maxArea(int[] heights) {
        int maxWater = 0;
        int lp = 0;
        int rp = heights.length - 1;

        while(lp < rp){
            int width = rp - lp;
            int ht = Math.min(heights[lp], heights[rp]);
            int currWater = width*ht;
            maxWater = Math.max(currWater, maxWater);

            if(heights[lp] < heights[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
}
