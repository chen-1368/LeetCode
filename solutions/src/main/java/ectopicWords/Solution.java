package ectopicWords;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int plen=p.length();
        int frequency=s.length()-plen+1;
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < frequency; i++) {
            if(checkEctopic(s.substring(i,i+plen),p))
                list.add(i);
        }
        return list;
    }
    public boolean checkEctopic(String s1,String s2){
        int[] num=new int[26];//默认都是0
        //查询s1全部字母并加入字母表
        for (int i = 0; i < s1.length(); i++) {
            int index=s1.charAt(i)-'a';
            num[index]+=1;
        }
        //查询s2全部字母并删除字母表，若等于-1直接返回false
        for (int i = 0; i < s2.length(); i++) {
            int index=s2.charAt(i)-'a';
            if((num[index]-=1)==-1)
                return false;
        }
        return true;
    }
}
