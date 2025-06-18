class Solution {

    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> result = new ArrayList<>();      // local to the “main” method
        backTracking(s, 0, new HashSet<>(wordDict),   // fast look‑ups
                     new StringBuilder(), result);
        return result;
    }

    private void backTracking(String s, int start,
                              HashSet<String> dict,
                              StringBuilder path,
                              List<String> result) {

        if (start == s.length()) {                    // reached end → record sentence
            result.add(path.toString().trim());
            return;
        }

        for (int end = start + 1; end <= s.length(); end++) {
            String word = s.substring(start, end);
            if (dict.contains(word)) {
                int len = path.length();              // remember length to back‑track
                path.append(word).append(' ');

                backTracking(s, end, dict, path, result);

                path.setLength(len);                  // undo append (classic back‑track)
            }
        }
    }
}
