package com.imthenalls;

/*
the plan

get a server or something
store stuff there
and tehn do stuff to it
???
profit


 */

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Practice practice = new Practice();
        int[] nums = {1,1,1,3,3,4,3,2,4,2,2,2,4};
        String s = "rrccaea";
        String t = "racecar";
        String x = "anagram";
        String y = "nagaram";
        String j = "rat";
        String k = "cat";
        System.out.println("HashMap: "+practice.containsDuplicate(nums));
        System.out.println("ArrayList: "+practice.containsDuplicateList(nums));
        System.out.println("Anagram :"+practice.isPalindrome(s,t));
        System.out.println("Anagram :"+practice.isPalindrome(j,k));
        System.out.println("Anagram :"+practice.isAnagram(x,y));
        System.out.println("Anagram :"+practice.isAnagram(j,k));
    }
}