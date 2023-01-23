package DAY104;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
Set <Integer> setint=new HashSet<>();

        for(int num:nums)
        {
            if(setint.contains(num))
            return true;
            setint.add(num);
        }
        return false;
        
    }
}
