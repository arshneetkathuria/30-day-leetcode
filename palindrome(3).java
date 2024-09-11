class Solution {
    public boolean isPalindrome(int x) {
        if (x<0)
        return false;
      int r;
        int newNum=0;
        int originalNum=x;
        while(x!=0)
        {
            r=x%10;
            newNum=newNum*10+r;
            x=x/10;

        }
        if(newNum==originalNum)
        return true;
        else
        return false;
    }
}