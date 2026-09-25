class Solution {
    public int reverseBits(int n) {

        int result = 0;

        // Check all 32 bits
        for (int i = 0; i < 32; i++) {

            // Make space in result
            result = result << 1;

            // Take last bit of n and put it in result
            result = result | (n & 1);

            // Move to the next bit
            n = n >>> 1;
        }

        return result;
    }
}