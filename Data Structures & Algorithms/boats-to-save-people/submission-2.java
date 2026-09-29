class Solution {
    public int numRescueBoats(int[] people, int limit) {

        Arrays.sort(people);

        int lp = 0;
        int rp = people.length - 1;
        int count = 0;

        while (lp <= rp) {

            if (people[lp] + people[rp] <= limit) {
                lp++;
            }

            rp--;
            count++;
        }

        return count;
    }
}