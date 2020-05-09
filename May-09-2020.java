// Given a positive integer num, write a function which returns True if num is a perfect square else False.

// Note: Do not use any built-in library function such as sqrt.

class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1)  return true;
        for(int i=1;i<num;i++){
            int res = i*i;
            if(res>num) return false;
            if(i*i==num) return true;
        }
        return false;
    }
}