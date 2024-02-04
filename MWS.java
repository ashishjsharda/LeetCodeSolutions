class MWS {

  //https://leetcode.com/problems/minimum-window-substring/?envType=daily-question&envId=2024-02-04
    public String minWindow(String s, String t) {
        String result = "";

        if(t.length() > s.length()) {
            return "";
        }

        int n = s.length(), m = t.length();
        int freq1[] = new int[128];
        int freq2[] = new int[128];
        for (char c : t.toCharArray()) {
            freq1[c]++;
        }
        int l = 0, len = n + 1;
        int cnt = 0;
        for (int i = 0; i < n ; i++){
            char temp = s.charAt(i);
            freq2[temp]++;
            if (freq1[temp] != 0 && freq2[temp] <= freq1[temp]) {
                cnt++;
            }
            if (cnt == m) {
                while (freq2[s.charAt(l)] > freq1[s.charAt(l)] || freq1[s.charAt(l)] == 0) {
                    if (freq2[s.charAt(l)] > freq1[s.charAt(l)]) {
                        freq2[s.charAt(l)]--;
                    }
                    l++;
                }
                if (len > i - l + 1) {
                    len = i - l + 1;
                    result = s.substring(l, l + len);
                }
            }
        }
        return (result.length() == 0 ? "" : result);
    }
}
