class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n = people.length;
        int lp = 0, rp =n-1;
        int boats = 0;
        Arrays.sort(people);
        while(lp <= rp) {
            if(people[lp] + people[rp] <= limit){
                lp++;
                rp--;
            } else {
                rp--;
            }
            boats++;
        }
        return boats;
    }
}