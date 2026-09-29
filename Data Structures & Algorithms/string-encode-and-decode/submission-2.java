class Solution {

    public String encode(List<String> strs) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < strs.size(); i++) {
            result.append(strs.get(i).length());
            result.append("#");
            result.append(strs.get(i));
        }

        return result.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int i =0;
        char[] arr = str.toCharArray();
        while(i<arr.length){
            StringBuilder sb = new StringBuilder();
            if(Character.isDigit(arr[i])){
                int n = 0;
                while(arr[i]!='#'){
                    n=n*10+(arr[i]-'0');
                    i++;
                }
                i++;
                while(n!=0){
                    sb.append(arr[i]);
                    n--;
                    i++;
                }
            }
            ans.add(sb.toString());
        }

        return ans;
    }
}