package com.imthenalls;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Practice {

    public boolean containsDuplicate(int[] nums)
    {
        HashMap<Integer,Integer> dupMap = new HashMap<>();
        for(int i : nums)
        {
            if(dupMap.containsKey(i)){
                return true;
            }
            dupMap.put(i,i);
        }
        return false;
    }

    public boolean containsDuplicateList(int[] nums)
    {
        ArrayList<Integer> dupList = new ArrayList<>();
        for(int i : nums)
        {
            if(dupList.contains(i)){
                return true;
            }
            dupList.add(i);
        }
        return false;
    }


    private boolean sameChars(String s, String t)
    {
        char first[] = s.toCharArray();
        char second[] = t.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);
        return Arrays.equals(first,second);
    }
    public boolean isPalindrome(String s, String t){


        if(!sameChars(s,t))
            return false;

        int start = 0;
        int end = t.length()-1;
        while(start<end){
            if(t.charAt(start) != t.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;
    }

    public boolean isAnagram(String s, String t){
        return sameChars(s,t);
    }


}
