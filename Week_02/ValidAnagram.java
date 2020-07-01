
/**
 * @author https://www.chuckfang.com
 * @date Created on 2020/7/2 00:07
 */
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();

        if(c1.length != c2.length) {
            return false;
        }

        int[] m1 = new int[128];
        int[] m2 = new int[128];

        for(char c : c1) {
            m1[c]++;
        }
        for(char c : c2) {
            m2[c]++;
        }

        for(char c : c1) {
            if(m1[c] != m2[c]){
                return false;
            }
        }
        return true;
    }
}
