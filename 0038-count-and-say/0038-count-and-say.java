
class Solution {
    public String countAndSay(int n) {

        String s = "1";

        for (int i = 1; i < n; i++) {

            String ans = "";
            int count = 1;

            for (int j = 0; j < s.length(); j++) {

                if (j + 1 < s.length() && s.charAt(j) == s.charAt(j + 1)) {
                    count++;
                } 
                else {
                    ans = ans + count + s.charAt(j);
                    count = 1;
                }
            }

            s = ans;
        }

        return s;
    }
}
