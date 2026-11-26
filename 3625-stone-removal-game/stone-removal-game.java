class Solution {
    public boolean canAliceWin(int n) {
        int count = 0;
        int sub = 10;
        while(n > 0){
            if(n < sub)break;
            n = n - sub;
            sub -= 1;
            count++;

        }
        if(count % 2 == 0)return false;
        return true;
    }
}