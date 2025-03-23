package rectangle;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<rectangle> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new rectangle(sc.nextInt(),sc.nextInt(),sc.nextByte()));
        }
        sc.close();
        int count = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; (i+j+1)<n ; j++) {
                if (checkOk(list.get(i),list.get(i+j+1)))
                    count++;
            }
        }
        System.out.println(count%(1000000007));
    }
    static boolean checkOk(rectangle r1, rectangle r2){
        if (r1.c==r2.c) return false;
        if (r1.l>r2.l&&r1.w<r2.w) return true;
        if (r1.l<r2.l&&r1.w>r2.w) return true;
        return false;
    }
    static class rectangle{
        public int l,w;
        public byte c;
        public rectangle(int l,int w,byte c){
            this.l=l;
            this.w=w;
            this.c=c;
        }
    }
}
