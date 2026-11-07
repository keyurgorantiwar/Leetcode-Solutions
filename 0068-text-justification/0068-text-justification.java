class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {

        List<String> ans = new ArrayList<>();

        int i = 0;

        while(i < words.length) {

            int j = i;
            int len = 0;

            // Find how many words can fit in one line
            while(j < words.length && len + words[j].length() + (j-i) <= maxWidth) {
                len = len + words[j].length();
                j++;
            }

            int spaces = maxWidth - len;
            int gaps = j - i - 1;

            StringBuilder s = new StringBuilder();

            // Last line OR only one word
            if(j == words.length || gaps == 0) {

                for(int k = i; k < j; k++) {
                    s.append(words[k]);

                    if(k < j - 1) {
                        s.append(" ");
                    }
                }

                while(s.length() < maxWidth) {
                    s.append(" ");
                }
            }

            // Normal line: distribute spaces equally
            else {

                int space = spaces / gaps;
                int extra = spaces % gaps;

                for(int k = i; k < j - 1; k++) {

                    s.append(words[k]);

                    int count = space;

                    if(extra > 0) {
                        count++;
                        extra--;
                    }

                    for(int x = 0; x < count; x++) {
                        s.append(" ");
                    }
                }

                s.append(words[j-1]);
            }

            ans.add(s.toString());

            i = j;
        }

        return ans;
    }
}