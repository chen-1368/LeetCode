package snake;

public class Solution {
    public static void main(String[] args) {
        int[] zm=new int[26];
        String str="snake";
        for (int i = 0; i < str.length(); i++) {
            zm[str.charAt(i)-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < zm.length; i++) {
            if(zm[i]>0){
                sb.append((char)(i+'a'));
            }
        }
        System.out.println(sb.toString());
    }
}
