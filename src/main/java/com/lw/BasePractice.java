package com.lw;

/**
 * @author lw
 */
public class BasePractice {
    public static void main(String[] param){
        System.out.println("my practice !!!");
        String s = new String("2");
        s.intern();
        String s2 = "2";
        System.out.println(s == s2);


        String s3 = new String("3") + new String("3");
        s3.intern();
        String s4 = "33";
        System.out.println(s3 == s4);


        Integer i = Integer.valueOf(128);
        Integer j = 128;
        //false
        System.out.println(i.equals(j));

        int k = 51;
        int parent = (k - 1) >>> 1;
        //false
        System.out.println(parent);
    }
}
