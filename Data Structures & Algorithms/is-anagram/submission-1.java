class Solution {
    public boolean isAnagram(String s, String t) {
            //sort
            char[] ss = s.toCharArray();
            char[] st = t.toCharArray();

            Arrays.sort(ss);
            Arrays.sort(st);

            return Arrays.equals(ss,st);
            
    }
}
