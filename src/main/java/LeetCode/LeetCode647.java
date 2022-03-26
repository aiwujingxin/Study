package LeetCode;

/**
 * @author jingxinwu
 * @date 2022-03-11 4:45 PM
 */
public class LeetCode647 {


    int count = 0;

    public int countSubstrings(String s) {

        if (s == null || s.length() == 0) {
            return 0;
        }

        for (int i = 0; i < s.length(); i++) {
            count += helper(s, i, i);
            count += helper(s, i, i + 1);
        }
        return 0;
    }

    private int helper(String s, int i, int j) {

        int count = 0;

        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
            count++;
        }

        return count;

    }


}
