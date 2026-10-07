class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;
        for(int pile : piles)
        {
            r = Math.max(r,pile);
        }
        //[34,34,6,4,63,45,3,5,35,34,132,5,35,3]
        //[1,2,3,4,5,6......................132]
        int res = r;
        while(l<=r)
        {
            int totalTime = 0;
            int mid = (l+r)/2;//66
            
            for(int pile : piles){
                totalTime+=(int)Math.ceil((double)pile/mid);
            }

            if(totalTime>h)
            {
                l = mid + 1;
            }else if(totalTime<=h)
            {
                res = mid;
                r = mid-1;
            }
            
        }
    return res;

    }
}
